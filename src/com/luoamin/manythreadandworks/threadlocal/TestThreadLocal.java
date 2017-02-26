package com.luoamin.manythreadandworks.threadlocal;

import java.sql.Connection;
/**
 * ThreadLocal解决线程安全问题
 * 因为下面的Connection对象在有的时候就不创建了，就是想一个单利的对象
 * 然后实现对象共享
 * @author john
 *ThreadLocal直接放在DAO只能做到本DAO的多个方法共享Connection时不发生线程安全问题
 *，但无法和其它DAO共用同一个Connection，要做到同一事务多DAO共享同一Connection，
 *必须在一个共同的外部类使用ThreadLocal保存Connection
 */
public class TestThreadLocal {
	private static ThreadLocal<Connection> local=new ThreadLocal<Connection>();
	public static Connection getConnection(){
		if(local.get()==null){
			Connection con=getConnection();
			local.set(con);
			return con;
		}else{
			return local.get();
		}
	}
}
