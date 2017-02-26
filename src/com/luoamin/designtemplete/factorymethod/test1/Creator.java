package com.luoamin.designtemplete.factorymethod.test1;
/**
 * 将对象放到创建接口来创建,然后在实现了创建接口的工厂类创建对象
 * @author john
 *
 */
public interface Creator {
    Dianbinxiang create();
}
