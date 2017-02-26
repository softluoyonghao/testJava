package com.luoamin.datastruct;

public class SeqStack implements Stack {
	public final int defaultSize=10;
	public int top;//栈的元素个数
	public int maxSize;//栈的最大存储个数
	Object[] stack;
	public SeqStack(){
		init(defaultSize);
	}
	public SeqStack(int size){
		init(size);
	}
	public void init(int size){
		maxSize=size;
		top=0;
		stack=new Object[size];
	}
	@Override
	public void push(Object obj) throws Exception {
		if(top>maxSize){
			throw new Exception("堆栈已满！");
		}
		stack[top]=obj;
		top++;
	}

	@Override
	public Object pop() throws Exception {
		if(top==0){
			throw new Exception("堆栈为空！");
		}
		top--;
		return stack[top];//元素删除后，将删除的元素返回
	}

	@Override
	public Object getTop() throws Exception {
		return stack[top];
	}

	@Override
	public boolean isEmpty() throws Exception {
		return top==0;
	}

}
