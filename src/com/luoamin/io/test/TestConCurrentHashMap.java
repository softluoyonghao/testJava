package com.luoamin.io.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class TestConCurrentHashMap {

	public static void main(String[] args) {
		 Map<Long, String> conMap = new HashMap<Long, String>();
	        for (long i = 0; i < 15; i++) {
	            conMap.put(i, i + "");
	        }

	        for (Entry<Long, String> entry : conMap.entrySet()) {
	            long key = entry.getKey();
	            if (key < 10) {
	                conMap.remove(key);
	            }
	        }

	}
}
