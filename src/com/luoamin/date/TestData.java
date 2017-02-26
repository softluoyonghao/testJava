package com.luoamin.date;

import java.io.RandomAccessFile;

public class TestData extends TestSimpleDateFormat{
	
	public void getData(){
		super.getCurrentDate();//继承的子类可以访问父类的protected修饰的方法，但是不能访问private的方法
	}
	
	public void getResource(){
		System.out.println("dsfsdf");
		Math.abs(0);
		
	}

}
