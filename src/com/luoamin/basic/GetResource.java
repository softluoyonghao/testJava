package com.luoamin.basic;

public class GetResource {
	
	public void getG(){
		TestData d=new TestData();
		d.getResource();;//不能访问私有的getResource方法
	}

}
