package com.luoamin.thread.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class TestConCurrentHashMap {
	 public volatile  int count = 0;
	public static void main(String[] args) {
		TestConCurrentHashMap a=new TestConCurrentHashMap();
		TestConCurrentHashMap b=new TestConCurrentHashMap();
		String vv="fff";
		//com.luoamin.thread.test.TestConCurrentHashMap@1d209d56对象
		//24ee5d13,1171716823======619601171,101286对象或者字符串、数字的哈希码，他是一个int类型数字
		System.out.println(a+"======"+b.hashCode());
		System.out.println(vv.hashCode());
	}
	
	public static void testHashMap(){
		/*HashMap或者ArrayList边遍历边删除数据会报java.util.ConcurrentModificationException异常*/
		 Map<Long, String> conMap = new HashMap<Long, String>();
	        for (long i = 0; i < 15; i++) {
	            conMap.put(i, 	i + "");
	        }
	        Thread thread = new Thread(new Runnable() {
	        	public void run(){}
	        });
	        Thread thread2 = new Thread(new Runnable() {
	        	public void run(){}
	        });
	        for (Entry<Long, String> entry : conMap.entrySet()) {
	            long key = entry.getKey();
	            if (key < 10) {
	                conMap.remove(key);
	            }
	        }
	}
	public static void testConCurrentHashMap(){
		/**对ConcurrentHashMap边遍历边删除或者增加操作不会产生异常(可以不用迭代方式删除元素)，
		 * 因为其内部已经做了维护，遍历的时候都能获得最新的值。即便是多个线程一起删除、添加元素也没问题。
		 * */
		
		 Map<Long, String> conMap = new ConcurrentHashMap<Long, String>();
	        for (long i = 0; i < 15; i++) {
	            conMap.put(i, i + "");
	        }

	        for (Entry<Long, String> entry : conMap.entrySet()) {
	            long key = entry.getKey();
	            if (key < 10) {
	                conMap.remove(key);
	            }
	        }

	        for (Entry<Long, String> entry : conMap.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	}
	
}
