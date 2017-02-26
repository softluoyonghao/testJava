package com.luoamin.thread.test1;

import java.util.concurrent.ThreadPoolExecutor;

public class TestSinoton {

	
	private TestSinoton(){};
	private static  TestSinoton instance=null;
	public static TestSinoton getInstance(){
		if(instance==null){
			instance=new TestSinoton();
		}
		return instance;
	}
	
	
	public static void main(String[] args) {
//		TestSinoton  a=TestSinoton.getInstance();
//		TestSinoton  b=TestSinoton.getInstance();
//		TestSinoton  c=TestSinoton.getInstance();
//		System.out.println(a.hashCode()+"++++++++="+b.hashCode()+"========="+c.hashCode());
		Integer a=5;
		int b=5;
		String ff=new String("ggg");
		String ff1=new String("ggg");
		System.out.println();
		
	
	}
}
