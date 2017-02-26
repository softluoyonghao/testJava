package com.luoamin.designtemplete.singon;

public class Sington1 {
	
	private Sington1(){}
	public static Sington1 instance=null;
	public static Sington1 newInstance(){
		//需要就来拿，懒汉是
		if(instance==null){
			instance=new Sington1();
		}
		return instance;
	}
}
