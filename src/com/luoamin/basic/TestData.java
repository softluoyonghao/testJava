package com.luoamin.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.luoamin.date.TestSimpleDateFormat;

public class TestData extends TestSimpleDateFormat{
	
	public void getData(){
		super.getCurrentDate();//继承的子类可以访问父类的protected修饰的方法，但是不能访问private的方法
	}
	
	public void getResource(){
		System.out.println("dsfsdf");
		Math.abs(0);
		String ss=new String("KKKK");
		List list=new ArrayList();
		list.add("1");
		Iterator it=list.iterator();
		for(Iterator fg=list.iterator();fg.hasNext();){}
	}

}
