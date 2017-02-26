package com.luoamin.factory.abstractfactoty.test1;

public class Factory1 implements Factory{

	@Override
	public ClouseA creatorA() {
		return new ClouseA1();
	}

	@Override
	public ClouseB creatorB() {
		return new ClouseB1();
	}

}
