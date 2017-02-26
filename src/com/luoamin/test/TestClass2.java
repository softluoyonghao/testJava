package com.luoamin.test;

public class TestClass2 {
	public int ff=3;
	public static void main(String[] args) {
		//类方法不能访问
		
		TestClass ccc=new TestClass();
		ccc.faleng();
		TestClass.faxian();
		TestClass.mama();
	}
	
	
	public void ggg(){
		TestClass.k=2;
		ff=5;
		TestClass ccc=new TestClass();
		ccc.faleng();
		TestClass.faxian();
		TestClass.mama();
		
	}
	
	
}
