package com.luoamin.factory.abstractfactoty;

public class FactoryA implements Factory{

	@Override
	public Washer createWash() {
		return new WasherA();
	}

	@Override
	public Icebox createIcebox() {
		return new IceboxA();
	}

}
