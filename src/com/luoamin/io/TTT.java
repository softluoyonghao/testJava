package com.luoamin.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TTT {
	
	public void print(){
		try {
			PrintWriter ww=new PrintWriter("D:/luoamin/测试/aaa.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws Exception {
	
	}
}