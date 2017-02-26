package com.luoamin.proxy.test1;

public class TimeGaoTie implements Go{
	private Go go;
	public TimeGaoTie(Go go){
		this.go=go;
	}
	@Override
	public void go() {
		System.out.println("计时开始。。。");
		go.go();
		System.out.println("及时结束。。。");
	}

}
