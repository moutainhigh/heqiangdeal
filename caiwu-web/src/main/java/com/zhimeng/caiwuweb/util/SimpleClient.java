package com.zhimeng.caiwuweb.util;

import java.io.IOException;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
/** *//**
 * 最简单的HTTP客户端,用来演示通过GET或者POST方式访问某个页面
 * @author Liudong
 */
public class SimpleClient {
    public static void main(String[] args) throws IOException
    {
        HttpClient client = new HttpClient();
        //设置代理服务器地址和端口
        //client.getHostConfiguration().setProxy("proxy_host_addr",proxy_port);
        //使用GET方法，如果服务器需要通过HTTPS连接，那只需要将下面URL中的http换成https
        HttpMethod method = new GetMethod("http://timor.tech/api/holiday/info/2020-05-05");
        //使用POST方法
        //HttpMethod method = new PostMethod("http://timor.tech/api/holiday/info/2020-05-05";);
        client.executeMethod(method);
        //打印服务器返回的状态
        System.out.println("第一次就觉得");
        System.out.println(method.getStatusLine());
        //打印返回的信息
        System.out.println(method.getResponseBodyAsString());
        //释放连接
        method.releaseConnection();

    }
}
