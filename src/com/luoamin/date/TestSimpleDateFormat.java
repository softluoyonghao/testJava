package com.luoamin.date;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
			System.out.println(getCurrentDate());
	}
	/**
	 * 将日期类型数据转换为字符串类型数据
	 * @return
	 */
	public static String getCurrentDate(){
		Date date=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datex=sim.format(date);
		return datex;
	}

}
