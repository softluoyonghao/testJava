package com.luoamin.thread;
/**
 * 多线程的生产者消费者模式,标准
 * */
public class ProducerAndConsumer {

	public static void main(String[] args) {
		Resources re=new Resources();
		Producer pro=new Producer(re);
		Consumer con=new Consumer(re);
		Thread t1=new Thread(pro);
		Thread t2=new Thread(pro);
		Thread t3=new Thread(con);
		Thread t4=new Thread(con);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class Resources{
	 String name;
	boolean flag=false;
	public synchronized  void set(String name){
		while(true){
			if(this.flag){
				try {
					wait();//因为调用该方法是resource锁对象，所以可以写成this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				this.name=name;
				System.out.println("生产者生产一条数据"+this.name);
				this.flag=true;
				notifyAll();//因为调用该方法是resource锁对象，所以可以写成this.wait();
			}	
		}
	}
	
	public synchronized void cus(){
		while(true){
			if(!this.flag){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("消费者消费一条数据"+this.name);
				this.flag=false;
				notifyAll();
			}
		}
	}
}


class Producer implements Runnable{
	//通过聚合的方式将资源注入到生产者对象中
	private Resources re;
	public Producer(Resources re){
		this.re=re;
	}
	public void run(){
		re.set("我爱你");
	}
}


class Consumer implements Runnable{
	private Resources re;
	public Consumer(Resources re){
		this.re=re;
	}
	public void run(){
		re.cus();
	}
}
