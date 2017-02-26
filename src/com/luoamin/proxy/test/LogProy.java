package com.luoamin.proxy.test;

public class LogProy implements Moveable{

	private Moveable  move;
	public LogProy(Moveable move){
		this.move=move;
	}
	public void move() {
		System.out.println("日志开始");
		move.move();
		System.out.println("日志结束");
	}

}
