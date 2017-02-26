package com.luoamin.proxy.test;

public class Car implements Moveable{

	@Override
	public void move() {
		System.out.println("汽车行驶中。。。");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
