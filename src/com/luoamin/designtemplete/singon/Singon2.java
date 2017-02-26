package com.luoamin.designtemplete.singon;

public class Singon2 {

	
	private Singon2(){}
	public static final Singon2 instance =new Singon2();
	//在类声明时已经初始化了对象，为恶汉式
	public static Singon2 getInstance(){
		return instance;
	}
}
