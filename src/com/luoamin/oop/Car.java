package com.luoamin.oop;

public class Car {
	private String carName;
	public Car(){}
	public Car(String carName){
		this.carName=carName;
		System.out.println(carName);
	}
	public  void getCar(){
		System.out.println("这是父类car！");
	}

}
