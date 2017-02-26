package com.luoamin.thread.test1;

public class DieThread extends Thread{
	private boolean flag;//flag其实没有什么用，关键用在推出线程的标志
	public DieThread(boolean flag){
		this.flag=flag;
	}
	public static void main(String[] args) {
		DieThread t1=new DieThread(true);
		DieThread t2=new DieThread(false);
		t1.start();
		t2.start();
	}
	
	public void run(){
		for(int i=0;i<100;i++){
			if(i<50){//flag
				synchronized (Resource1.obj1) {
					System.out.println("obj1");
					synchronized(Resource1.obj2){
						System.out.println(Thread.currentThread().getName()+"====="+i);
					}
				}
			}else{
				synchronized (Resource1.obj2) {
					System.out.println("obj2");
					synchronized(Resource1.obj1){
						System.out.println(Thread.currentThread().getName()+"====="+i);
					}
				}
			}
		}
	}
}

class Resource1{
	static Object obj1=new Object();
	static Object obj2=new Object();
}

