package com.luoamin.thread;

public class ThreadCommunication {
	/*alt+方向键可以将想要的代码移动到想要的地方*/
	public static void main(String[] args) {
		Resource re = new Resource();
		Input in = new Input(re);
		Output out = new Output(re);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		Thread t3 = new Thread(in);//如果多添加一个线程，那么就要使用resource.notifyAll();，线程通信结束
		t1.start();
		t2.start();
		t3.start();
	}
}

class Resource {
	String name;
	String sex;
	boolean flag = false;
}
/**多线程通讯（wait(),notify(),notifyAll()）,这个歌方法必须在synchronized里面调用
 * 并且这几个方法必须要锁的对象来调用，即resource.notifyAll()，已经给resource对象上锁
 * 多线程安全的两个线程必须持有同一把锁
 * 线程可以给任意对象上锁，例如Object对象
 * 
 * */
class Input implements Runnable {
	private Resource resource;

	// 构造方法注入可以使得调用两个线程时 可以共用同一资源，resource对象，精彩之处
	public Input(Resource resource) {
		this.resource = resource;
	}

	public void run() {
		int x = 0;
		while (true) {
				synchronized (resource) {
					if (resource.flag) {//如果为true，先让他睡一觉
						try {
							resource.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {

					if (x == 0) {
						resource.name = "楠楠";
						resource.sex = "女";
					} else {
						resource.name = "彪彪";
						resource.sex = "男";
					}
					x = (x + 1) % 2;
					resource.flag = true;
					resource.notifyAll();
					}
				}
			}
		}
	}


class Output implements Runnable {
	private Resource resource;
	public Output(Resource resource) {
		this.resource = resource;
	}
	public void run() {
		while (true) {
			/*
			 * 因为这个线程共用resource这个资源，自由保证他们是同一把锁才能保证多线程输出不会出问题，
			 * 到这里，就不会出现性别，名称错乱了，但还有一个问题，如果我想两个人的信息交叉输出又该怎么弄
			 * wait方法是将手中的执行权利交出，不能和notifyAll方法同时在一个条件快中执行
			 */
				synchronized (resource) {
					if (!resource.flag) {
						try {
							resource.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
					System.out.println("姓名：" + resource.name + "   性别："
							+ resource.sex);
					resource.flag = false;
					resource.notifyAll();
				}
			}
		}
	}
}