package com.luoamin.thread;

public class ThreadSington {
	
	private ThreadSington(){}
	public static ThreadSington instance=null;
	//饿汉式不会存在线程安全问题，因为在类加载的时候就已经实例化了，没有判断，所有没有线程安全问题
	public static ThreadSington getInstance(){
		if(instance==null){//这里比运用同步函数要高效
			synchronized (ThreadSington.class){//静态方法的锁是Class对象，写this会报错
				if(instance==null){//懒汉式单例模式由于这里要判断，会存在线程安全问题，加上同步
					instance=new ThreadSington();
				}
			}
		}
		return instance;
	}
}
