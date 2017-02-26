package com.luoamin.proxy;

import java.util.Random;

public class Tunk implements Moveable{

	@Override
	public void move() {
		System.out.println("坦克移动中");
		/**生成随机数有两种方法，1是使用Math类的random方法
		 * ，另外一种是使用Random类Random.nextInt(100),0-100之间的随机数
		 * */
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void go() {
		System.out.println("去哪里，坦克");
	}

}
