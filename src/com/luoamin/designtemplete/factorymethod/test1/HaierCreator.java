package com.luoamin.designtemplete.factorymethod.test1;

public class HaierCreator implements Creator {

	@Override
	public Dianbinxiang create() {
		return new Haier();
	}

}
