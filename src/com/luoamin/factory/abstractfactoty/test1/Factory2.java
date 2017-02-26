package com.luoamin.factory.abstractfactoty.test1;

public class Factory2 implements Factory{

	@Override
	public ClouseA creatorA() {
		return new ClouseA2();
	}

	@Override
	public ClouseB creatorB() {
		return new ClouseB2();
	}

}
