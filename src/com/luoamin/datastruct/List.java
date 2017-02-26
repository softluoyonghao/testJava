package com.luoamin.datastruct;

public interface List {
	
	void insert(int i,Object obj)throws Exception;
	Object delete(int i)throws Exception;
	void update(int i,Object obj)throws Exception;
	Object getData(int i)throws Exception;
	boolean isEmpty(int size);
	int getSize();
}
