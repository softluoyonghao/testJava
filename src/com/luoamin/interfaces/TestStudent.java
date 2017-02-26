package com.luoamin.interfaces;

import org.junit.Test;

public abstract  class TestStudent implements DaoOperation<Student> {
    public abstract void logs();
    
	@Override
	public void add(Student stu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public  void log() {
		System.out.println("实现了父类的日志");
	}
	
	@Test
	public void tedst(){
	}

}
