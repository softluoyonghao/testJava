package com.luoamin.designtemplete.factorymethod.test1;

public class GeliCreator implements Creator {

	@Override
	public Dianbinxiang create() {
		return new Geli();
	}

}
