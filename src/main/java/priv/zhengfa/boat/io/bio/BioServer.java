package priv.zhengfa.boat.io.bio;

import priv.zhengfa.boat.io.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: nullWagesException
 * @Date: 2020/7/22 19:58
 * @Description: BIO模型服务端
 */
public class BioServer implements Server {

    private List<Socket> sockets = new ArrayList<>(16);

    private ServerSocket serverSocket;

    private AtomicInteger links;

    public BioServer(int port){
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(){
        System.out.println("Bio服务端已启动");
        Socket socket = null;
        while (true){
            try {
                socket = serverSocket.accept();
                if (socket != null){
                    sockets.add(socket);
                    links.getAndIncrement();
                    new Thread(new BioHandler(socket)).start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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


}
