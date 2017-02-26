package com.luoamin.datastruct;

public interface Queue {
	void insert(Object obj)throws Exception;
	Object pop()throws Exception;
	Object getHead()throws Exception;
	Object getFoot()throws Exception;
	boolean isEmpty()throws Exception;
	boolean isFull()throws Exception;
}
