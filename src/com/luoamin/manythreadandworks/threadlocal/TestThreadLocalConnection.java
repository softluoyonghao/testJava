package com.luoamin.manythreadandworks.threadlocal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestThreadLocalConnection {
	private static ThreadLocal<Connection>local=new  ThreadLocal<Connection>();
	
	/*重写ThreadLocal的initialValue方法，他的返回值为Object对象*/
	public static Connection initialValue(){
		Connection con=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	/*获取数据库连接*/
	public static Connection getConnection(){
		return local.get();
	}
	public static void setConnection(Connection con){
		local.set(con);
	}

}
