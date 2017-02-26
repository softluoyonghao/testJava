package com.luoamin.factory.abstractfactoty;
/**
 * 抽象工厂模式，主要是在工厂方法的基础上在对所创建的对象进行分类
 * 好的分类能为具体工厂类的选择调用和以后的扩展提供清晰的思路
 * @author john
 *
 */
public interface Factory {

	Washer createWash();
	Icebox createIcebox();
}
