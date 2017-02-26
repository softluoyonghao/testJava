package com.luoamin.designtemplete.singon;

public class Testq {
	
	public static void main(String[] args) {
		Sington1  sin=Sington1.newInstance();
		Sington1  sin1=Sington1.newInstance();
		
		Singon2  sin3=Singon2.getInstance();
		Singon2  sin4=Singon2.getInstance();
		if(sin==sin1){
			System.out.println("sin==sin1,他们是同一个对象");
			if(sin3==sin4){
				System.out.println("sin3==sin4,他们是同一个对象");
			}
		}else if(sin!=sin1){
			System.out.println("sin==sin1,他们不是同一个对象");
		}else if(sin3==sin4){
			System.out.println("sin3==sin4,他们是同一个对象");
		}else if(sin3!=sin4){
			System.out.println("sin3==sin4,他们不是同一个对象");
		}
	}

}
