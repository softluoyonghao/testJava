package com.luoamin.io.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * try块中如果有一个return语句，那么他是会执行的，但是在finally语句之前
 * 如果try块出现异常，一样会执行finally里面的代码
 * */
public class TestReturn {
	
	public static void main(String[] args) {
		
		Map<String,String>map=new ConcurrentHashMap<String,String>();
		String sss=getLog();
		System.out.println(sss);
		try {
			throw new ClassNotFoundException("代码运行");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static String getLog(){
		System.out.println("我爱中国！");
		try{
			Class.forName("com.luoamin.io.test.TestFile");
			System.out.println("程序执行中。。。。。。。");
			System.exit(0);//代码执行到这里
			return "true";
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}finally{
			System.out.println("程序执行完毕！");
		}
	}

}
