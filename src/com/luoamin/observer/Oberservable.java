package com.luoamin.observer;
/**
 * 具体的被观察者，他有两个方法，一个是change方法（用于自身改变），然后通知观察者
 * 一个是addObservers，用来供客户端访问
 */
import java.util.ArrayList;
import java.util.List;

public class Oberservable {

	List<Observer>list=new ArrayList<Observer>();
	public void addObservers(Observer o){
		list.add(o);
	}
	
	public void changed(){
		System.out.println("我是被观察者，我发生变化了");
		notifyObserver();
	}
	
	public void notifyObserver(){
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}
