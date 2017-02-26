package com.luoamin.thread;

public class TestSington {
	
	
	public static void main(String[] args) {
		ThreadSington  t1=ThreadSington.getInstance();
		ThreadSington  t2=ThreadSington.getInstance();
		if(t1==t2){
			System.out.println("t1和t2是同一个对象");
		}else{
			System.out.println("t1和t2不是同一个对象");
		}
	}

}
