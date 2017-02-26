package com.luoamin.datastruct;

public class TestStackList {
	
	public static void main(String[] args) {
		Stack stack=new SeqStack(10);
		
		try {
			stack.getTop();
			boolean is=stack.isEmpty();
			stack.push("sdfsdf");
			stack.getTop();
			is=stack.isEmpty();
			System.out.println(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
