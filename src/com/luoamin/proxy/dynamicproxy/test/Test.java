package com.luoamin.proxy.dynamicproxy.test;

import java.lang.reflect.Proxy;

import com.luoamin.proxy.Moveable;
import com.luoamin.proxy.Tunk;

public class Test {
	public static void main(String[] args) {
		Tunk t=new Tunk();
		DynmicProxy  dy=new DynmicProxy(t);
		Moveable mo=(Moveable)Proxy.newProxyInstance(t.getClass().getClassLoader(), new Class[]{Moveable.class}, dy);
		mo.move();
	}

}
