package com.luoamin.net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		ServerSocket ss=null;
		Socket socket=null;
		
		InputStream in=null;
		OutputStream out=null;
		try {
			ss=new ServerSocket(8888);
			socket=ss.accept();
			byte[]b=new byte[1024];
			int len=0;
			in=socket.getInputStream();
			while((len=in.read(b))!=-1){
				System.out.println("服务器收到客户端"+socket.getInetAddress().getHostAddress()+"的信息"+new String(b,0,len));
			}
			
			out=socket.getOutputStream();
			out.write("客户端你好，我已经收到你的信息".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				socket.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
