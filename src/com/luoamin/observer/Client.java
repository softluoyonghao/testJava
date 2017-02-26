package com.luoamin.observer;
/*jdk有现成的观察者被观察者接口*/
import java.util.Observable;

public class Client {
	public static void main(String[] args) {
		Oberservable able=new Oberservable();
		able.addObservers(new Observer1());
		able.addObservers(new Observer2());
		able.changed();
	}

}
