package com.luoamin.thread;
	/*死锁*/
public class DieSynchronized {

	public static void main(String[] args) {
		Die  dy=new Die(true);
		Die  dy1=new Die(false);
		Thread t1=new Thread(dy);
		Thread t2=new Thread(dy1);
		t1.start();
		t2.start();
	}
}

class Die implements Runnable{
	private boolean flag=false;
	public Die(){
	}
	public Die(boolean flag){
	    this.flag=flag;	
	}
	@Override
	public void run() {
		if(flag){
/*if和else两个线程中，if里面占用a锁，还要占用b锁，else里面占用b锁，还要占用a锁，资源互相不释放，所以造成死锁
 * 另，如果一个锁被一个对象占用，就不能被另一个对象来占用
 * 
 * */
			synchronized (MyLock.locka) {
				System.out.println("if locka");
				synchronized (MyLock.lockb) {
					System.out.println("if lockb");
				}
			}
		}else{
				synchronized (MyLock.lockb) {
					System.out.println("else lockb");
					synchronized (MyLock.locka) {
						System.out.println("else locka");
					}
			}
		}
	}
	
}

class MyLock{
	static Object locka=new Object();
	static Object lockb=new Object();
}

