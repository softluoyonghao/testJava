package com.luoamin.factory.abstractfactoty;

public class WasherB implements Washer{

	public WasherB(){
		System.out.println("洗衣机B被生产出来了");
	}

	@Override
	public void washTrouse() {
		System.out.println("洗衣机B洗衣服");
		
	}
}
