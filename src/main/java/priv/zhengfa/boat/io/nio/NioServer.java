package priv.zhengfa.boat.io.nio;

import priv.zhengfa.boat.io.Server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.Set;

/**
 * @Author: nullWagesException
 * @Date: 2020/7/23 20:05
 * @Description:
 */
public class NioServer implements Server<Socket> {
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void send(byte[] bytes) {

    }

    @Override
    public byte[] receive() {
        return new byte[0];
    }

    @Override
    public List getSockets() {
        return null;
    }

    @Override
    public int getLinkSize() {
        return 0;
    }

//    private SocketChannel socketChannel;
//    private Selector selector;
//
//
//    public NioServer(int port){
//
//        try {
//            //创建服务器通道
//            socketChannel = SocketChannel.open();
//            socketChannel.bind(new InetSocketAddress(port));
//            //设置服务器通道为非阻塞
//            socketChannel.configureBlocking(false);
//
//            selector = Selector.open();
//            //注册selector，设置监听模式为套接字接收时
//            socketChannel.register(selector, SelectionKey.OP_ACCEPT);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void start() {
//        System.out.println("服务端已启动");
//        while (true){
//            try {
//                //阻塞至此，当有channel准备就绪后会返回
//                selector.select();
//                //获取就绪的channel
//                Set<SelectionKey> selectionKeys = selector.selectedKeys();
//                for (SelectionKey selectionKey : selectionKeys) {
//
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

}
