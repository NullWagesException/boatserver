package priv.zhengfa.boat.io;

import java.net.Socket;
import java.util.List;

/**
 * @Author: nullWagesException
 * @Date: 2020/7/22 21:21
 * @Description:
 */
public interface Server<T> {

    /**
     * 启动服务器
     */
    void start();

    /**
     * 终止服务器
     */
    void stop();

    /**
     * 向客户端发送数据的方法
     * @param bytes 需要发送的数据
     */
    void send(byte[] bytes);

    /**
     * 接受来自客户端数据的方法
     * @return 客户端传输的字节数组
     */
    byte[] receive();

    /**
     * 获取所有连接
     * @return 所有连接
     */
    List<T> getSockets();

    /**
     * 获取当前连接数
     * @return 当前连接数
     */
    int getLinkSize();
}
