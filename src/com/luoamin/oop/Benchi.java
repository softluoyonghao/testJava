package com.luoamin.oop;
/**
 * super("父亲的轿车")方法表示调用父类的构造方法，其实也可以不用写，因为
 * 不写会默认调用继承关系的super（）方法，如果写了，可以调用父类不同的构造方法
 * 以便进行一些变量的初始化
 * @author john
 *
 */
public class Benchi extends Car{

	public Benchi(){
		super("父亲的轿车");
		System.out.println("方法调用完毕！");
	}
	public  void getBenchi(){
		System.out.println("这是一辆奔驰轿车！");
		super.getCar();
	}
	
	public static void main(String[] args) {
		Benchi ben=new Benchi();
		ben.getCar();
		
		ben.getBenchi();
	}
}
