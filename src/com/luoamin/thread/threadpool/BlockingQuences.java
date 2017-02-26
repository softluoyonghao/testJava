package com.luoamin.thread.threadpool;

import java.util.PriorityQueue;
/**
 * 使用阻塞队列实现生产者消费者模式比使用非阻塞队列简单
 * @author john
 *某个模块负责产生数据，这些数据由另一个模块来负责处理（此处的模块是广义的，可以是类、函数、线程、进程等）
 *产生数据的模块，就形象地称为生产者；而处理数据的模块，就称为消费者。 
 */
public class BlockingQuences {
	private int size=10;
	private PriorityQueue<Integer>quene=new PriorityQueue<Integer>(size);
	public static void main(String[] args) {
		BlockingQuences t1=new BlockingQuences();
		Producer  po=t1.new Producer();
		Consumer  co=t1.new Consumer();
		po.start();
		co.start();
	}
	
	class Producer extends Thread{
		public void run(){
			while(true){
				synchronized (quene) {
					if(quene.size()==size){
						try {
							System.out.println("队列已满，不能继续插入数据！");
							quene.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
							quene.notify();
						}
					}else{
						//非阻塞队列推荐使用offer方法添加元素
						quene.offer(1);
						System.out.println("队列插入一条数据！");
						quene.notify();
					}
				}
			}
		}
	}
	
	class Consumer extends Thread{
		public void run(){

			while(true){
				synchronized (quene) {
					if(quene.size()==0){
						try {
							System.out.println("队列空，不能删除！");
							quene.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
							quene.notify();
						}
					}else{
						//非阻塞队列推荐使用poll方法删除元素
						quene.poll();
						System.out.println("队列删除一条数据！");
						quene.notify();
					}
				}
			}
		
		}
	}
}


