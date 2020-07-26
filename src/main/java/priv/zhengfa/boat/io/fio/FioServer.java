package priv.zhengfa.boat.io.fio;

import priv.zhengfa.boat.io.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: nullWagesException
 * @Date: 2020/7/22 21:41
 * @Description: fegin BIO模型服务端
 */
public class FioServer implements Server<Socket> {
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
    public List<Socket> getSockets() {
        return null;
    }

    @Override
    public int getLinkSize() {
        return 0;
    }

//    private ServerSocket serverSocket;
//    private ThreadPoolExecutor executor;
//
//    public FioServer(int port){
//        try {
//            serverSocket = new ServerSocket(port);
//            executor = new ThreadPoolExecutor(8, 10,
//                    60, TimeUnit.SECONDS,
//                    new ArrayBlockingQueue<>(20));
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
//                Socket socket = serverSocket.accept();
//                if (socket != null){
//                    executor.submit(new FioHandler(socket));
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
