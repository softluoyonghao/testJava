package com.luoamin.designtemplete.factorymethod;

public class TubeLight implements Light{

	@Override
	public void turnOn() {
		System.out.println("TubeLight turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("TubeLight turn off");
	}

}
