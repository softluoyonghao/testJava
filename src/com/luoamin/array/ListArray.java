package com.luoamin.array;

import com.luoamin.date.TestData;

public class ListArray {
	/**线程不安全：多个线程在操作共享数据时，一个线程对资源还没执行完，另一个线程也操作这个资源
		所以导致数据不一致的问题，解决该问题办法：对于多线程只能让一个线程操作数据，其他线程只能暂时
	 * */
	
	public static void main(String[] args) {
		MyThread  ff=new MyThread();
		//多个线程操作同一个资源，即操作同一段代码
		Thread a=new Thread(ff,"thread1");
		Thread b=new Thread(ff,"thread2");
		Thread c=new Thread(ff,"thread3");
		
		TestData d=new TestData();
		d.getResource();//能访问其他包的只有public
		a.start();
		b.start();
		c.start();
	}
}


class MyThread extends Thread{
	private int  ticket=100;
	Object obj=new Object();
	public void run(){
		/*通过synchronized关键字，给资源加上一把锁，obj就是那把锁，随便一个什么对象都可以*/
		while(true){
			synchronized (obj) {
				  try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
						if(ticket>0){
							System.out.println(Thread.currentThread().getName()+"线程买票"+ticket--);
					}
			}
		}
	}
}