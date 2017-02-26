package com.luoamin.factory.abstractfactoty;

public class FactoryB implements Factory{

	public Washer createWash() {
		return new WasherB();
	}

	public Icebox createIcebox() {
		return new IceBoxB();
	}

}
