package priv.zhengfa.boat.io;

/**
 * @Author: nullWagesException
 * @Date: 2020/7/22 21:23
 * @Description:
 */
public interface Client {


    /**
     * 终止客户端
     */
    void stop();

    /**
     * 向服务端发送数据的方法
     * @param bytes 需要发送的数据
     */
    void send(byte[] bytes);

    /**
     * 接受来自服务端数据的方法
     * @return 服务端传输的字节数组
     */
    byte[] receive();


}
