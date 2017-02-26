package com.luoamin.datastruct;

public interface Stack {
	//元素进栈，添加
	void push(Object obj)throws Exception;
	//元素出栈，删除
	Object pop()throws Exception;
	//获取栈顶元素
	Object getTop()throws Exception;
	boolean isEmpty()throws Exception;
}
