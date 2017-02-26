package com.luoamin.thread;

public class ThreadMethod {
	public static void main(String[] args) {
		MyThreadrun  aaa=new MyThreadrun();
		
		Thread t1=new Thread(aaa);
		MyThreadn t2=new   MyThreadn();
		t1.setDaemon(true);
		t1.setPriority(Thread.MAX_PRIORITY);//10,最大执行权限
		t1.start();
		
		try {
			t1.join();//先让t1执行
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
	}

}

class MyThreadrun implements Runnable {
	public void run(){
		
		for(int i=0;i<10;i++){
			System.out.println("线程一"+i);
		}
	}
}

class MyThreadn extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("线程二"+i);
		}
	}
}
