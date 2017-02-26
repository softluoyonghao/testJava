package com.luoamin.designtemplete.factorymethod;

public class BuildCreator implements Creator{

	@Override
	public Light createLight() {
		return new BuildLight();
	}

}
