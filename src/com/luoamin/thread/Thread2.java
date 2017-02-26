package com.luoamin.thread;

public class Thread2 {
	/**
	  同步，实现方法有同步代码块和同步函数，同步代码块共用的是自定义对象的锁，同步函数
	共用的是this锁,只能写this，即当前调用同步函数对象的锁，如果同步函数的synchronized关键字前面加上static关键字
	那么同步函数此时共用当前对象的Class对象的锁，因为静态方法在没有实例化对象前就已经加载到类里面去了，
	而此时也有对应的Class对象，所以共用当前对象的Class对象的锁
	 * */
	public static void main(String[] args) {
		MyHread  tt=new MyHread();
		Thread a=new Thread(tt,"线程一");
		Thread b=new Thread(tt,"线程二");
		a.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//为了让线程一和线程二都能有执行的机会
		tt.flag=false;
		b.start();
	}

}


class MyHread implements Runnable{
	private static  int ticket=100;
	public  boolean flag=true;
	Object obj=new Object();
	public void run(){
		if(flag){
			while(true){
				synchronized (MyHread.class){
					if(ticket>0){
						try {
							Thread.sleep(10);//等待线程一加入
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"同步代码块剩余的票"+ticket--);
					}	
				}
			}	
		  }else{
				while(true){
					show();	
			}
			
		}
	}
	
	public static  synchronized void show(){
		if(ticket>0){
			System.out.println(Thread.currentThread().getName()+"同步函数剩余的票"+ticket--);
		}	
	}
	
}
