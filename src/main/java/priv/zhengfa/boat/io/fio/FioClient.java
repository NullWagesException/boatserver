package priv.zhengfa.boat.io.fio;

import priv.zhengfa.boat.io.Client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: nullWagesException
 * @Date: 2020/7/22 19:59
 * @Description: 伪异步FIO模型客户端
 */
public class FioClient implements Client {

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

//    private Socket socket;
//
//    public FioClient(int port){
//        try {
//            socket = new Socket("127.0.0.1", port);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void send(String str){
//        OutputStream out = null;
//        try {
//            out = socket.getOutputStream();
//            out.write(str.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//            try {
//                if (out != null) {
//                    out.close();
//                }
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//
//            try {
//                socket.close();
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//        }
//    }

}
