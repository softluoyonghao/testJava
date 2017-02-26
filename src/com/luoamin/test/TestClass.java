package com.luoamin.test;

public  class  TestClass {
	
	public String id;
	public static  int k; 
	public static void faxian(){
		TestClass.k=3;
		//类方法只能访问类变量
		//id="ee";
		k=2;
		mama();
		TestClass  ccc=new TestClass();
		ccc.faleng();
		System.out.println("-----------------");
		
	}
	
	public void faleng(){
		k=2;
		id="";
		System.out.println();
	}
	
	public static void mama(){
		System.out.println("jjjjj");
		
	}
	
	public void TestClass(){
		System.out.println("ooo");
	}

}
