package com.luoamin.interfaces;

public interface DaoInteferce<T> {
	
	void add(T t);
	void delete();
	void update();
	Student select();
	

}
