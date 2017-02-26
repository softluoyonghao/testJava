package com.luoamin.thread.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
	/**
	 * 自定义线程池
	 */

	
	public static void main(String[] args) {
		muthreadpool();
		System.out.println(System.currentTimeMillis());
	}
	
	public static void muthreadpool(){
		//ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue)
		//创建等待队列  
		BlockingQueue quen=new ArrayBlockingQueue(20);
		ThreadPoolExecutor pool =new ThreadPoolExecutor(2, 3, 2, TimeUnit.MILLISECONDS, quen);
		Thread t1=new MyThread2();
		Thread t2=new MyThread2();
		Thread t3=new MyThread2();
		Thread t4=new MyThread2();
		Thread t5=new MyThread2();
		//将线程加入线程池中执行
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		pool.shutdown();
//		for(;;){死循环
//			
//		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"线程进行中。。。");
	}
}