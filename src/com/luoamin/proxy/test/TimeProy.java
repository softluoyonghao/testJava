package com.luoamin.proxy.test;

public class TimeProy implements Moveable{

	private Moveable move;
	public TimeProy(Moveable move){
		this.move=move;
	}
	
	public void move(){
		System.out.println("汽车开始行驶。。。");
		long starttime=System.currentTimeMillis();
		move.move();
		long endtime=System.currentTimeMillis();
		System.out.println("汽车行驶结束。。。");
		System.out.println("汽车行驶"+(endtime-starttime));
	}
}
