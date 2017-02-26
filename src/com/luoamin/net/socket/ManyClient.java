package com.luoamin.net.socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
/** * Socket客户端
* 功能说明： * * @author 大智若愚的小懂 * 
* @Date 2016年8月30日 * @version 1.0 
* */
public class ManyClient {
	 public static void main(String[] args) {
	        Socket sk = null;
	        BufferedReader br = null;
	        try {
	            sk = new Socket("localhost", 8899);
	            
	            br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
	             String line = null;
	             while((line = br.readLine()) != null){
	                 System.out.println("我来了:"+line);     //服务器端打印客户端发送的信息数据
	             }
	        } catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        } finally {
	            try {
	                if (sk != null) {
	                    sk.close();
	                }
	                if (br != null) {
	                    br.close();
	                }
	            } catch (Exception ex) {
	                System.out.println(ex.getMessage());
	            }
	        }
	    }
}
