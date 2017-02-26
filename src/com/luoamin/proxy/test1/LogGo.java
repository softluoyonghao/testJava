package com.luoamin.proxy.test1;

public class LogGo implements Go{
	
	private Go go;
	public LogGo(Go go){
		this.go=go;
	}
	public void go() {
		System.out.println("日志开始。。。");
		go.go();
		System.out.println("日志结束。。。");
	}

}
