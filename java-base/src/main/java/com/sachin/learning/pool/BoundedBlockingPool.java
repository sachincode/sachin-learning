package com.sachin.learning.pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author shicheng.zhang
 * @since 17-4-27 下午4:49
 */
public final class BoundedBlockingPool<T> extends AbstractPool<T>implements BlockingPool<T> {

    private int size;
    private BlockingQueue<T> objects;
    private Validator<T> validator;
    private ObjectFactory<T> objectFactory;
    private ExecutorService executor = Executors.newCachedThreadPool();
    private volatile boolean shutdownCalled;

    public BoundedBlockingPool(int size, Validator<T> validator, ObjectFactory<T> objectFactory) {
        super();
        this.size = size;
        this.validator = validator;
        this.objectFactory = objectFactory;
        objects = new LinkedBlockingDeque<T>(size);
        initializedObjects();
        shutdownCalled = false;
    }

    private void initializedObjects() {
        for (int i = 0; i < size; i++) {
            objects.add(objectFactory.createNew());
        }
    }

    @Override
    protected void handleInvalidReturn(T t) {

    }

    @Override
    protected void returnToPool(T t) {
        if (validator.isValid(t)) {
            executor.submit(new ObjectReturner(objects, t));
        }
    }

    @Override
    protected boolean isValid(T t) {
        return validator.isValid(t);
    }

    @Override
    public T get(long time, TimeUnit unit) throws InterruptedException {
        if (!shutdownCalled) {
            try {
                return objects.poll(time, unit);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return null;
        }
        throw new IllegalStateException("Object pool is already shutdown");
    }

    @Override
    public T get() {
        if (!shutdownCalled) {
            try {
                return objects.take();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return null;
        }
        throw new IllegalStateException("Object pool is already shutdown");
    }

    @Override
    public void shutdown() {
        shutdownCalled = true;
        executor.shutdownNow();
        clearResources();
    }

    private void clearResources() {
        for (T object : objects) {
            validator.invalidate(object);
        }
    }

    private class ObjectReturner implements Callable<Object> {

        private BlockingQueue<T> queue;
        private T t;

        public ObjectReturner(BlockingQueue<T> objects, T t) {
            this.queue = objects;
            this.t = t;
        }

        @Override
        public Object call() throws Exception {
            while (true) {
                try {
                    queue.put(t);
                    break;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            return null;
        }
    }
}
