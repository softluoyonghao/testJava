package com.luoamin.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 
 * 文件拷贝
 * @author john
 *
 */
public class FileOperator {
	
	public static void fileCopy() {
//		FileInputStream  in =null;
//		FileOutputStream  out=null;
//		try {
//			in=new FileInputStream("D:/abc.txt");
//			out=new FileOutputStream("E:/abc.txt"); 
//			byte []buff=new byte[1024];
//			int stream=0;
//			while((stream=in.read(buff))>0){
//				out.write(buff, 0, stream);
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		FileReader in=null;
		FileWriter  out=null;
		try {
			in = new FileReader("D:/abc.txt");
			out=new FileWriter("e:/abc.txt");
			char []ff=new char[50];
			int stream =0;
			while((stream=in.read(ff))>0){
				out.write(ff, 0, stream);
				out.flush();// 最好加上
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(out!=null){
				out.close();
				}
				if(in!=null){
				in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		fileCopy();
	}
}
