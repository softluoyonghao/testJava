package com.luoamin.net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 多次启动客户端就可以实现多个客户端连接服务器
 * @author john
 *
 */
public class ManyClientServer {
	  public static void main(String [] args){
	        ServerSocket ss = null;
	        Socket sk = null;
	        int count=0;
	        try{
	            System.out.println("create server socket....");
	            ss = new ServerSocket(8899);
	            System.out.println("wait for a connection....");
	            while(true)     //服务器端一直监听这个端口，等待客户端的连接
	            {
	              sk = ss.accept();  //当有客户端连接时，产生阻塞               
	              System.out.println("get a socket object...");
	              new SocketThread(sk).start();//新建一个socketThread处理这个客户端的socket连接
	              count++;
	              System.out.println("客户端数量"+count);
	            }
	        }
	        catch(Exception ex){
	            System.out.println(ex.getMessage());
	        }
	        finally{
	          try{
	              if(ss != null){
	                  ss.close();
	              }
	              if(sk != null){
	                  sk.close();
	              }
	          }
	          catch(Exception ex){
	              System.out.println(ex.getMessage());
	          }
	        }
	      }
}
