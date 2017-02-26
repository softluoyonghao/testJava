package com.luoamin.proxy.dynamicproxy;

import java.lang.reflect.Proxy;
import com.luoamin.proxy.Moveable;
import com.luoamin.proxy.Tunk;

public class Test   {
	
	public static void main(String[] args) {
		//这样就实现了不同对象的代理内容。
		Tunk tunk=new Tunk();
		DynmicProxy  dy=new DynmicProxy(tunk);
		Moveable mo=(Moveable)Proxy.newProxyInstance(tunk.getClass().getClassLoader(), new Class[]{Moveable.class}, dy);
		mo.move();//最后调用接口的方法
	}
	
	
}
