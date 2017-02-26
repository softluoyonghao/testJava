package com.luoamin.thread.test;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Test1 {
	
	public static void main(String[] args) {
		String []aaa={};
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("kan", "ain");
		map.put("amin", "laiba");
		
		for(int i=0;i<aaa.length;i++){
			map.put("aaa"+i, aaa[i]);
		}
		if(map.containsKey("aaa0")){
			map.remove("aaa0");
		}
		for(Map.Entry<String,String>map1 :map.entrySet()){
//			System.out.println(map1.toString());
		}
	}
	
	public HashMap<String, List<Object>> getList(){
		return null;
	}

	@Test
	public void ggg(){
		System.out.println("我爱你");
		
		String aaa="fff";
		try {
			//aaa.getBytes("iso8859-1")写成aaa.getBytes()也可以
			String b=new String(aaa.getBytes("iso8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
