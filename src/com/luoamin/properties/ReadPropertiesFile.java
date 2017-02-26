package com.luoamin.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class ReadPropertiesFile {
	
	/**
	 * 读取配置文件的数据,getResourceAsStream其实就是输入流luoamin.propertiess
	 * 但是文件路径里面的/表示classpath路径，即程序编译后的bin目录，如果没有/，那么就是代表和源
	 *	文件(当前java类)是统一路径，注意getResourceAsStream方法不能完全按照简单输入流来用，
	 *	因为这个输入流是用来解析工程里面的资源文件的，ServletContext. getResourceAsStream(String path)：
	 * 默认从WebAPP根目录下取资源

	 */
	public static void loadFile(){
	Properties pro=new Properties();
	try {
//		pro.load(new FileInputStream("D:/luoamin/luoamin.ini"));
		pro.load(ReadPropertiesFile.class.getResourceAsStream("luoamin.properties"));
		Enumeration  enu=pro.propertyNames();
		System.out.println(pro);
		while(enu.hasMoreElements()){
			String key=(String)enu.nextElement();
			String value=pro.getProperty(key);
			System.out.println(key+"+++++++++++"+value);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
  }
	
	
	/**
	 * 获取jvm的系统属性
	 * @param args
	 */
	public static void getProperties(){
		Properties pro=System.getProperties();
		pro.list(System.out);
	}
	
	/**
	 * 往配置文件写入数据
	 * @param args
	 */
	public static void writeData(String key,String value){
		Properties pro=new Properties();
//		InputStream in=null;
		OutputStream out=null;
		try {
//			 in=new FileInputStream("D:/luoamin/luoamin.ini");
			 out=new FileOutputStream("D:/luoamin/luoamin1.ini");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		 pro.setProperty("one-two", "buckle my shoe");
		 pro.setProperty("three-four", "shut the door");
		try {
			pro.store(out, key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 返回属性列表中所有键的枚举
		Enumeration enu =pro.propertyNames();
		while(enu.hasMoreElements()){
			String key1=(String)enu.nextElement();
			String value1=pro.getProperty(key1);
			System.out.println(key1+"============="+value1);
		}
	}
	
	public static void main(String[] args) {
		loadFile();
	}

}
