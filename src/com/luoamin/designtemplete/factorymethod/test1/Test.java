package com.luoamin.designtemplete.factorymethod.test1;

public class Test {
	
	public static void main(String[] args) {
		Creator or=new HaierCreator();
		//创建了海尔对象
		Dianbinxiang hi=or.create();
		hi.bindong();
		hi.guanbi();
		
		
		Creator or1=new GeliCreator();
		//创建了格力对象
		Dianbinxiang hi1=or1.create();
		hi1.bindong();
		hi1.guanbi();
	}

}
