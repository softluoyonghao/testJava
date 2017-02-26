package com.luoamin.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynmicProxy implements InvocationHandler{
	/*target，被代理对象,表示要对那种对象进行代理*/
	private Object target;
	public DynmicProxy(Object target1){
		this.target=target1;
	}
	//这样就实现了不同对象的代理内容,只需要在动态代理类添加业务逻辑，就可以实现想要的代理功能
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("日志开始");
		long start =System.currentTimeMillis();
		System.out.println(proxy.getClass()+"++++++"+method.getName()+"+++++"+args);
		Object obj=method.invoke(target, args);
		long end=System.currentTimeMillis();
		System.out.println("坦克行驶时间为"+(end-start));
		System.out.println("日志结束");
		return obj;
	}

}
