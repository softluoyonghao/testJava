package com.luoamin.io.test;

import java.util.Random;

public class TestDubug {
	
	public static void main(String[] args) {
		getM(0);
	}
	
	private static int value=0;
	
	public static int getValue() {
		return value;
	}

	public static void setValue(int value) {
		TestDubug.value = value;
	}

	public static void getM(int count){
		System.out.println("你们好啊");
		int a=3;
		 value=new Random().nextInt(10);
		int b=a+count;
		System.out.println("任务完成！");
		System.out.println(b);
	}

}
