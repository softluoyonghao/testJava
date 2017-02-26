package com.luoamin.test;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

public class TestHashMap {
	
	public static void main(String[] args) {
//		Map<String,String>map=new HashMap<String, String>(); 
//		Map<String,String>map1=new Hashtable<String, String>(); 
////		map.put("kaixin", null);
////		map1.put("haole", null);
////		System.out.println(map);
//		
//		
//		Vector<String>list=new Vector();
//		list.add("amin");
//		list.add("yufeng");
//		for (String string : list) {
//			System.out.println(string.toString());
//		}
		
//		File file =new File("D:/luoamin/测试");
//		getFile(file);
		
		
		
		String data="aabcexmkduyruieiopxzkkkasdfjxjdsds";
		String []aaa=data.split("");
		for (int i = 1; i < aaa.length; i++) {
				if(data.charAt(i))
			}
		
		
	}
		public static void getFile(File file){
			if(file.isDirectory()){
				System.out.println(file.getAbsolutePath());
				File[]files=file.listFiles();
				for(File file1:files){
					getFile(file1);
				}
			}else{
				System.out.println(file.getAbsolutePath());
			}
			
		}
		
		
		public static Connection getCon(){
			Connection  con=null;
			try {
				Class.forName("com.jdbc.oursql.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","test","test");
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return con;
		}
		
		
			
}
