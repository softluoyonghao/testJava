package com.luoamin.proxy.test1;

public class TestStaticProxy {
	
	public static void main(String[] args) {
		//先对日志代理在进行对时间的代理，就后使用
		Gaotie gao=new Gaotie();
		TimeGaoTie time=new TimeGaoTie(gao);
		LogGo   log=new LogGo(time);
		log.go();
	}

}
