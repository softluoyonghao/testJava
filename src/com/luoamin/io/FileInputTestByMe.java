package com.luoamin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * 这里仅仅对文件进行操作
 * @author john
 *
 */
public class FileInputTestByMe {
	/**字节流和字符流的最终父类是InputStream和OutPutString
	 * 字符流的最终父类是Reader和Writer
	 * 
	 * */
	
	public static void fileInputstream() throws IOException{
		FileInputStream  in=null;
		try {//io流路径必须是这种格式D://abc.txt或者是，D:/abc.txt，就是不能是\,还有\\
			in=new FileInputStream(new File("D:/abc.txt"));
			byte[] buff=new byte[1024];
			int stream=0;
			while((stream=in.read(buff))>0){
				System.out.println(new String(buff,0,stream));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			in.close();
		}
		
	} 
	public static void fileReader() throws IOException{
		FileReader  re=null;
		try {
			  re=new FileReader(new File("D:/applicationContext.xml"));
			  char[] buff=new char[50];
			  int stream=0;
			  while((stream=re.read(buff))>0){
				  System.out.println(new String(buff, 0,stream));
			  }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			re.close();
		}
	}
	/**
	 * 普通的输入输出流是不能操作文件夹的
	 */
	 
	public static void fileInLoaction() throws IOException{
		FileInputStream  in =null;
		try {
			in=new FileInputStream(new File("D:/applicationContext.xml"));
			byte[] buff=new byte[1024];
			int stream=0;
			while((stream=in.read(buff))>0){
				System.out.println(new String(buff,0,stream));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void fileIntest(){
		PrintWriter w=null;
		
	}
	
	
	
	public static void main(String[] args) {
		try {
			fileInLoaction();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
