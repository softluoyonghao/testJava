package com.luoamin.thread.test1;

public class MyThread extends Thread{
	Object obj=new Object();
	public void run(){
		
			for(int i=0;i<100;i++){
				synchronized (obj){
				System.out.println(Thread.currentThread().getName()+"====="+i);
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread  th=new MyThread();
		Thread t=new Thread(th, "线程a");
		Thread t1=new Thread(th, "线程b");
		t.start();
		t1.start();
	}
}
