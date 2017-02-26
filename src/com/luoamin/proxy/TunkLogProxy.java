package com.luoamin.proxy;

public class TunkLogProxy implements Moveable {
	private Moveable  mo;
	public TunkLogProxy(Moveable m){
		this.mo=m;
	};
	@Override
	public void move() {
		System.out.println("日志开始");
		mo.move();
		System.out.println("日志结束");
	}
	@Override
	public void go() {
		
	}

}
