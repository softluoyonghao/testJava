package com.luoamin.proxy;

public class Test {
	
	public static void main(String[] args) {
		Tunk t=new Tunk();
		TunkProxyTime ttt=new TunkProxyTime(t);
		//ttt.move();此种方法能实现tunk对时间的代理
		
		
		TunkLogProxy  log=new TunkLogProxy(ttt);
		log.move();//这种方式就会先记录日志，后记录时间
	}

}
