package com.luoamin.proxy.dynamicproxy;

import com.luoamin.proxy.Moveable;

public class Test1 {
	
	public static void main(String[] args) {
		Class load=Moveable.class;
		Integer a=0;
		int []aaa=new int[10];
		aaa.clone();
		
		Class load1=aaa.getClass();
		System.out.println(load);
		System.out.println(load1);
	}

}
