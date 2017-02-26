package com.luoamin.proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
	private Object target;
	public DynamicProxy(Object target){
		this.target=target;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("日志开始");
		System.out.println(proxy.getClass().getName());
		Object jjj= method.invoke(target, args);
		System.out.println("日志结束");
		return jjj;
	}

}
