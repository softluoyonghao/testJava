package com.luoamin.designtemplete.factorymethod.test1;

public class Haier implements Dianbinxiang{

	@Override
	public void bindong() {
		System.out.println("海尔电冰箱实现了冰冻功能");
	}

	@Override
	public void guanbi() {
		System.out.println("海尔电冰箱实现了关闭功能");
	}

}
