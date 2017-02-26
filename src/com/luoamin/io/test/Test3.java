package com.luoamin.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {
	
	public static void cpFile()throws IOException{
		//readLine是缓冲流的专用方法
		/*这里注意一点，因为aaa.txt文件是以asni的编码格式保存的，而eclipse的文件是以utf-8的格式
		保存的，编码格式不一样，所以写出的文件会是乱码，输出的文本会是乱码
		*/
		BufferedReader  in=null;
		BufferedWriter out=null;
		try {
			in=new BufferedReader(new FileReader("D:/luoamin/测试/aaa.txt"));
			out=new BufferedWriter(new FileWriter("D:/luoamin/测试/bbb.txt"));
			String b="";
			while((b=in.readLine())!=null){
				out.write(b);
				System.out.println(b);
				out.flush();
			}
		} catch ( IOException e) {
			e.printStackTrace();
		}finally{
			out.close();
			in.close();
		}
	}
	
	public static void main(String[] args)  {
	
//		File file=new File("D:/luoamin/测试/ccc.txt");
//		file.mkdir();
		try {
			cpFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
