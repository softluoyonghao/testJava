package com.luoamin.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class VariableThredPool {
	
	public static void main(String[] args) {
		danrenwu();
	}
	
	/**
	 * 可变尺寸的线程池
	 */
	public static void variablethreadpool(){
		//创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们
				ExecutorService pool =Executors.newCachedThreadPool();
				Thread t1=new MyThread1(); 
				Thread t2=new MyThread1();
				Thread t3=new MyThread1();
				Thread t4=new MyThread1();
				Thread t5=new MyThread1();
				//将线程放入池中进行执行  
				pool.execute(t1);
				pool.execute(t2);
				pool.execute(t3);
				pool.execute(t4);
				pool.execute(t5);
				pool.shutdown();
	}
	
	/**
	 * 延迟连接池
	 */
	public static void yanchiThreadPool(){
		//创建一个线程池，它可安排在给定延迟后运行命令或者定期地执行。  
		 ScheduledExecutorService pool =Executors.newScheduledThreadPool(2);
		Thread t1=new MyThread1(); 
		Thread t2=new MyThread1();
		Thread t3=new MyThread1();
		Thread t4=new MyThread1();
		Thread t5=new MyThread1();
		//将线程放入池中进行执行  
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.schedule(t4, 10, TimeUnit.MILLISECONDS);
		pool.schedule(t5, 10, TimeUnit.MILLISECONDS);
		pool.shutdown();
	}
	
	/**
	 * 单任务延迟连接池 
	 */
	public static void danrenwu(){
		//创建一个线程池，它可安排在给定延迟后运行命令或者定期地执行。  
		 ScheduledExecutorService pool =Executors.newSingleThreadScheduledExecutor();
		Thread t1=new MyThread1(); 
		Thread t2=new MyThread1();
		Thread t3=new MyThread1();
		Thread t4=new MyThread1();
		Thread t5=new MyThread1();
		//将线程放入池中进行执行  
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.schedule(t4, 10, TimeUnit.MILLISECONDS);
		pool.schedule(t5, 10, TimeUnit.MILLISECONDS);
		pool.shutdown();
	}

}

class MyThread1 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"线程完成！");
	}
}