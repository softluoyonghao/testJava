package com.luoamin.factory.abstractfactoty.test1;
/**
 * 抽象工厂模式与工厂方法模式的区别是抽象工厂对创建对象的工厂接口进行了分类
 * @author john
 *
 */
public class Test {
	public static void main(String[] args) {
		/*创建1系列产品*/
		Factory fa=new Factory1();
		ClouseA a=fa.creatorA();
		ClouseB b=fa.creatorB();
		a.createA();
		b.creatClouseB();
		
		
	}

}
