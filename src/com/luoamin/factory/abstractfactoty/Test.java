package com.luoamin.factory.abstractfactoty;

public class Test {
	public static void main(String[] args) {
		FactoryA a=new FactoryA();
		Icebox ice=a.createIcebox();
		Washer was=a.createWash();
		was.washTrouse();
	}

}
