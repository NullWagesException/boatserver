package priv.zhengfa.boat.io.bio;

import priv.zhengfa.boat.io.Client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: nullWagesException
 * @Date: 2020/7/22 19:59
 * @Description: BIO模型客户端
 */
public class BioClient implements Client {

    private Socket socket;

    public BioClient(int port){
        try {
            socket = new Socket("127.0.0.1", port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void send(byte[] bytes){
        OutputStream out = null;
        try {
            out = socket.getOutputStream();
            out.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            try {
                socket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    @Override
    public byte[] receive() {
        return new byte[0];
    }


}
