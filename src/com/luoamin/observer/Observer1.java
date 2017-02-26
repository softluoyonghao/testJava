package com.luoamin.observer;
/**
 * 具体的观察者
 * @author john
 *
 */
public class Observer1 implements Observer{

	@Override
	public void update(Oberservable o) {
		System.out.println("我是Observer1，我观察到了"+o.getClass().getSimpleName()+"发生了变化");
	}

}
