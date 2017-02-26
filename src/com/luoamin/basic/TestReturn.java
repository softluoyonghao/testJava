package com.luoamin.basic;

public class TestReturn {
	
	public static void main(String[] args) {
		System.out.println("当前的数据是："+add(2,3));
	}
	
	public static int add(int a,int b){
		try {
			return a+b;
		} catch (Exception e) {
			System.out.println("catch 块");
		}finally{
			System.out.println("finally 块");
		}
		return 0;
	}

}
