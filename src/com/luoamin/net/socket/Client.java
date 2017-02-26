package com.luoamin.net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		Socket socket=null;
		OutputStream out=null;
		InputStream in=null;
		try {
			   /* 我们的服务端处理客户端的连接请求是同步进行的， 每次接收到来自客户端的连接请求后，
	             * 都要先跟当前的客户端通信完之后才能再处理下一个连接请求。 这在并发比较多的情况下会严重影响程序的性能，
	             * 为此，我们可以把它改为如下这种异步处理与客户端通信的方式
	             */
			 socket =new Socket("127.0.0.1", 8888);
			 socket.setSoTimeout(6000);//设置socket超时时间
			 out=socket.getOutputStream();
			 out.write("服务器，你好，我是客户端JOJO".getBytes());
			 in=socket.getInputStream();
			 byte[] b=new byte[1024];
			 int num=0;
			 while((num=in.read(b))!=-1){
				 System.out.println("客户端收到答复"+new String(b,0,num));
			 }
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
