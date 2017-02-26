package com.luoamin.net.inetsddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	
	public static void main(String[] args) {
		try {
			//通过网络主机域名，获取InetAddress对象,[B@2d205042
			InetAddress  add=InetAddress.getByName("www.baidu.com");
			//通过byte[]的原始IP来InetAddress对象
			InetAddress.getByAddress(new byte[205042]);
			//返回本地主机
			InetAddress ff=InetAddress.getLocalHost();
			/*获取InetAddress对象后可以获取主机名，和IP地址*/
			System.out.println(add.getAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
