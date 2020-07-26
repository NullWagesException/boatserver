package priv.zhengfa.boat.io.fio;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @Author: nullWagesException
 * @Date: 2020/7/22 20:06
 * @Description: 伪异步FIO模型服务端线程
 */
public class FioHandler implements Runnable{

    private Socket socket;

    public FioHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端已连接：" + socket);
        InputStream inputStream = null;
        byte[] bytes = new byte[1024];
        while (true){
            try {
                inputStream = socket.getInputStream();
                int read = inputStream.read(bytes);
                if (read != 0){
                    System.out.println(socket + ":" + new String(bytes));
                }
            } catch (Exception e) {
                if (socket.isClosed()){
                    System.out.println("客户端已断开:" + socket);
                    break;
                }
                e.printStackTrace();
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                try {
                    if (socket == null){
                        System.out.println("客户端断开连接");
                        break;
                    }else {
                        socket.close();
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
