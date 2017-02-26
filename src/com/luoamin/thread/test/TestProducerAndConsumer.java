package com.luoamin.thread.test;
/**
 * 生产者消费者模式测试
 * @author john
 *
 */
public class TestProducerAndConsumer {
	public static void main(String[] args) {
		Resource re=new Resource();
		Producer pro=new Producer(re);
		Consumer con=new Consumer(re);
		Thread t1=new Thread(pro);
		Thread t2=new Thread(con);
		t1.start();
		t2.start();
	}

	
}

class Resource {
	 boolean flag=false;
	public synchronized void producer(){
		while(true){
			if(this.flag){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("生产者生产了一条数据！");
				this.flag=true;
				this.notify();
			}
		}
	}
	
	public synchronized void consumer(){
		while(true){
			if(!this.flag){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("消费者消费了一条数据！");
				this.flag=false;
				this.notify();
			}
		}
	}
	
}

class Producer implements Runnable{
	private Resource resource;
	public Producer(Resource resource){
		this.resource=resource;
	}
	@Override
	public void run() {
		resource.producer();
	}
	
}

class Consumer implements Runnable{
	private Resource resource;
	public Consumer(Resource resource){
		this.resource=resource;
	}
	@Override
	public void run() {
		resource.consumer();
	}
	
}