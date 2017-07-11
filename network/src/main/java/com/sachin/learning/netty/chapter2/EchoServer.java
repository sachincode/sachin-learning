package com.sachin.learning.netty.chapter2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;
import io.netty.channel.socket.SocketChannel;

/**
 * @author shicheng.zhang
 * @since 17-7-10 下午3:29
 */
public class EchoServer {

    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public static void main(String[] args) throws Exception {
//        if (args.length != 1) {
//            System.err.println("Usage: " + EchoServer.class.getSimpleName() + " <port>");
//            return;
//        }
//
//        // 设置端口值（如果端口参数的格式不正确，则抛出一个NumberFormatException）
//        int port = Integer.parseInt(args[0]);
        // 调用服务器的 start()方法
        int port = 8888;
        new EchoServer(port).start();
    }

    public void start() throws Exception {
        final EchoServerHandler serverHandler = new EchoServerHandler();

        EventLoopGroup group = new NioEventLoopGroup();

        try {
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(group).channel(NioServerSocketChannel.class).localAddress(new InetSocketAddress(port))
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            //EchoServerHandler 被标注为@Shareable，所以我们可以总是使用同样的实例
                            //这里对于所有的客户端连接来说，都会使用同一个 EchoServerHandler，因为其被标注为@Sharable，
                            ch.pipeline().addLast(serverHandler);
                        }
                    });

            //(6) 异步地绑定服务器；调用 sync()方法阻塞等待直到绑定完成
            ChannelFuture future = bootstrap.bind().sync();
            System.out.println(EchoServer.class.getName() +
                    " started and listening for connections on " + future.channel().localAddress());
            //(7) 获取 Channel 的CloseFuture，并且阻塞当前线程直到它完成
            future.channel().closeFuture().sync();
        } finally {
            //(8) 关闭 EventLoopGroup，释放所有的资源
            group.shutdownGracefully().sync();
        }
    }
}
