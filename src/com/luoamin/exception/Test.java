package com.luoamin.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
/**由测试结果得知finally的代码执行一定是在函数值返回之前，但是不是爱return语句之前，这要看
 * return语句是在try块里面还是在try块之外
 * 
 * @param args
 */
	public static void main(String[] args) {
		System.out.println(getG());
	}
	
	  public static String test11() {
	        try {
	            System.out.println("try block");
	            return test12();
	      }finally {
	           System.out.println("finally block");
	           
	       }
	  }

	  public static String test12() {
	       System.out.println("return statement");

	       return "after return";
	   }
	  
	  public static String getG(){
		  try {
			FileInputStream file=new FileInputStream(new File("d:eee.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("你错了哦");
		}
		  return "我爱你";
	  }

}
