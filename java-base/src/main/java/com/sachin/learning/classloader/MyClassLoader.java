package com.sachin.learning.classloader;

import java.io.FileInputStream;
import java.lang.reflect.Method;

/**
 * http://www.importnew.com/24036.html
 *
 * @author shicheng.zhang
 * @since 17-5-2 下午12:04
 */
public class MyClassLoader extends ClassLoader {

    private String classPath;

    public MyClassLoader(String classPath) {
        this.classPath = classPath;
    }

    private byte[] loadByte(String name) throws Exception {
        name = name.replaceAll("\\.", "/");
        FileInputStream fis = new FileInputStream(classPath + "/" + name + ".class");
        int len = fis.available();
        byte[] data = new byte[len];
        fis.read(data);
        fis.close();
        return data;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] bytes = loadByte(name);
            return defineClass(name, bytes, 0, bytes.length);
        } catch (Exception e) {
            throw new ClassNotFoundException(e.getMessage(), e);
        }
    }

    public static void main(String[] args) throws Exception {
        MyClassLoader classLoader = new MyClassLoader("/home/shichengzhang/test");
        Class<?> aClass = classLoader.loadClass("com.sachin.learning.classloader.Test");
        Object instance = aClass.newInstance();
        Method hello = aClass.getDeclaredMethod("hello", null);
        hello.invoke(instance, null);
    }
}
