package com.luoamin.exception;

public class TestException {
	public static void main(String[] args) {
		System.out.println("塔塔是坏人!");
		int a=3;
		if(a==3){
			try {
				throw new Exception("塔塔不是坏人！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("塔塔是好人！");
		}
		
	}

}
