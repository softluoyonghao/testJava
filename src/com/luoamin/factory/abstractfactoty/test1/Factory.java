package com.luoamin.factory.abstractfactoty.test1;
/**
 * 这是与工厂方法不同的地方，就是在创建接口对对象分类
 * @author john
 *
 */
public interface Factory {
  ClouseA creatorA();
  ClouseB creatorB();
}
