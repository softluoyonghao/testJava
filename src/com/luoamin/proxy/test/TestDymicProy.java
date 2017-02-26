package com.luoamin.proxy.test;

import java.lang.reflect.Proxy;

public class TestDymicProy {
	
	public static void main(String[] args) {
		Car car=new Car();
		DynamicProxy dy=new DynamicProxy(car);
		Moveable xd=(Moveable)Proxy.newProxyInstance(Car.class.getClassLoader(), new Class[]{Moveable.class}, dy);
		xd.move();
	}

}
