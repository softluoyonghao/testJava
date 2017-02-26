package com.luoamin.observer;
/**
 * 具体的观察者
 * @author john
 *
 */
public class Observer2 implements Observer{

	@Override
	public void update(Oberservable o) {
		System.out.println("我是Observer2，我观察到了"+o.getClass().getName()+"发生了变化");
	}

}
