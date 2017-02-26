package com.luoamin.factory.abstractfactoty;

public class WasherA implements Washer{

	public WasherA(){
		System.out.println("洗衣机A生产出来了");
	}

	@Override
	public void washTrouse() {
		System.out.println("洗衣机A洗衣服");
	}
}
