package com.luoamin.thread.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/**
 * 使用阻塞队列实现生产者消费者模式比使用非阻塞队列简单
 * @author john
 *某个模块负责产生数据，这些数据由另一个模块来负责处理（此处的模块是广义的，可以是类、函数、线程、进程等）
 *产生数据的模块，就形象地称为生产者；而处理数据的模块，就称为消费者。 
 */
public class SuspendQuene {

	private int size=10;
	private BlockingQueue<Integer>quene=new ArrayBlockingQueue<Integer>(size);
	public static void main(String[] args) {
		SuspendQuene t1=new SuspendQuene();
		Producer1  po=t1.new Producer1();
		Consumer1  co=t1.new Consumer1();
		po.start();
		co.start();
	}
	
	class Producer1 extends Thread{
		public void run(){
			while(true){
				synchronized (quene) {
						try {
							quene.put(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("队列插入一条数据！");
				}
			}
		}
	}
	
	class Consumer1 extends Thread{
		public void run(){
			while(true){
				synchronized (quene) {
						quene.poll();
						System.out.println("队列删除一条数据！");
				}
			}
		
		}
	}

}
