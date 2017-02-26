package com.luoamin.thread.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 固定大小线程池
 * 当线程任务的大小超过线程池的尺寸时，其他进入线程池的线程就会处于等待之中
 * @author john
 *
 */
public class FinalThreadPool {
	
	public static void main(String[] args) {
		//创建一个固定数量的线程池
		//1的运行结果
//		pool-1-thread-1线程开始+======
//				pool-1-thread-2线程开始+======
//				pool-1-thread-2线程开始+======
//				pool-1-thread-2线程开始+======
//				pool-1-thread-1线程开始+======
		ExecutorService pool=Executors.newFixedThreadPool(10);
		
		//单任务线程池，这里的线程池只会开一个任务
//	    ExecutorService pool = Executors.newSingleThreadExecutor(); 

		Thread t1=new MyThread();
		Thread t2=new MyThread();
		Thread t3=new MyThread();
		Thread t4=new MyThread();
		Thread t5=new MyThread();
		//将线程放入池中进行执行
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		pool.shutdown();
	}

}
class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"线程开始+======");
	}
}