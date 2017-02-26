package com.luoamin.thread;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class TestConCurrentHashMap {
	static Map<Long, String> conMap = new ConcurrentHashMap<Long, String>();
	public static void main(String[] args) {
		
	}
	
	public static void getCon(){
		/*多线程操作ConCurrentHashMap，即在里面定义多个线程循环操作,而hashmap就不可以；如果不用迭代器，就会
		 * 包java.util.ConcurrentModificationException异常，hashmap只要边遍历边删除就会出现
		 * 
		 * */
		  
	        for (long i = 0; i < 15; i++) {
	            conMap.put(i, i + "");
	        }
	        Thread thread = new Thread(new Runnable() {
	        	public void run(){ 
	        		conMap.put(100l, "100");
	        	}
	        });
	        Thread thread2 = new Thread(new Runnable() {
	        	public void run(){
	        		for(Iterator<Entry<Long,String>>iterator=conMap.entrySet().iterator();iterator.hasNext();){
	        			Entry<Long,String>entry=iterator.next();
	        			if(entry.getKey()>1){
	        				conMap.remove(entry.getKey());
	        			}
	        		}
	        	}
	        });
	        for (Entry<Long, String> entry : conMap.entrySet()) {
	            long key = entry.getKey();
	            if (key < 10) {
	                conMap.remove(key);
	            }
	        }

	}
}
