package com.luoamin.thread.test1;

public class Resource {
	private boolean flag=false;
	public synchronized void pro(){
		while(true){
			if(flag){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println(Thread.currentThread().getName()+"生产者生产了一条数据");
				flag=true;
				this.notify();
			}
		}
	}
	public synchronized void cus(){
		while(true){
			if(!flag){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println(Thread.currentThread().getName()+"消费者消费了一条数据");
				flag=false;
				this.notify();
			}
		}
	}
	
	public static void main(String[] args) {
		Resource th=new Resource();
		Producer pp=new Producer(th);
		Cusstomer cu=new Cusstomer(th);
		Thread t1=new Thread(pp,"线程a");
		Thread t2=new Thread(cu,"线程b");
		t1.start();
		t2.start();
	}
	
}
class Producer implements Runnable{
	private Resource resource;
	public Producer(Resource resource){
		this.resource=resource;
	}
	public void run() {
		resource.pro();
	}
}

class Cusstomer implements Runnable{
	private Resource resource;
	public Cusstomer(Resource resource){
		this.resource=resource;
	}
	public void run() {
		resource.cus();
	}
	
}




