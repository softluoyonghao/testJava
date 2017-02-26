package com.luoamin.thread.test;

public class DeadThread {
		public static void main(String[] args) {
			Dead de=new Dead(false);
			Dead de1=new  Dead(true);
			Thread t1=new Thread(de);
			Thread t2=new Thread(de1);
			t1.start();
			t2.start();
		}
	

}
class Dead implements Runnable{
	private boolean flag;
	public Dead(boolean flag){
		this.flag=flag;
	}
	@Override
	public void run() {
		if(flag){
			synchronized (Lock.a){
				System.out.println("锁住资源a");
				synchronized (Lock.b){
					System.out.println("锁住资源b");
				}
			}
		}else{
			synchronized (Lock.b){
				System.out.println("锁住资源b");
				synchronized (Lock.a){
					System.out.println("锁住资源a");
				}
			}
		}
	}
	
}
class Lock{
	static Object a=new Object();
	static Object b=new Object();
}