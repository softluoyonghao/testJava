package com.luoamin.designtemplete.factorymethod;
/**
 * 可以看到，我们使用可以随意的在具体的工厂和产品之间切换，并且不需要修改任何代码，就可以让原来的程序正常运行，
 * 这也是工厂方法模式对扩展开放的表现，另外工厂方法模式弥补了简单工厂模式不满足开闭原则的诟病，
 * 当我们需要增加产品时，只需要增加相应的产品和工厂类，而不需要修改现有的代码
 * 
 *客户端调用时不依赖于具体工厂和产品（即到底是mysql驱动，mysql数据库连接还是oracle驱动，
 *oracle连接，我们程序猿不需要管的，我们只管使用抽象的driver和connection，对吧？），
 *而是依赖于抽象工厂和抽象产品完成工作
 * @author john
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Creator cre=new BuildCreator();
		Light li=cre.createLight();
		li.turnOn();
		li.turnOff();
		
		Creator cre2=new TubeCreator();
		Light li2=cre2.createLight();
		li2.turnOn();
		li2.turnOff();
		
	}

}
