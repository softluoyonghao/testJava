package com.luoamin.designtemplete.factorymethod;

public class BuildLight implements Light{

	@Override
	public void turnOn() {
		System.out.println("BuildLight turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("BuildLight turn off");
	}

}
