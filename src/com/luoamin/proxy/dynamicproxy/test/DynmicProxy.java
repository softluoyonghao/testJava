package com.luoamin.proxy.dynamicproxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynmicProxy implements InvocationHandler{
	private Object obj;
	public DynmicProxy(Object obj){
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("日志开始。。。");
		System.out.println("计时开始。。。");
		Object ee=method.invoke(obj, args);
		System.out.println("计时结束");
		System.out.println("日志结束。。。");
		return ee;
	}

}
