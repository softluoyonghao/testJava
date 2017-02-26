package com.luoamin.io;

import java.io.File;

public class FileSeparate {
	
	public static void main(String[] args) {
		//File.separator,文件分隔符，windows下为\，Linux下为/
		String path=File.separator+"name"+File.separator+"user";
		File file=new File("D:/luoamin/测试");
//		System.out.println(path);
		//读取某个目录下面的文件或者文件夹
		File []file1=file.listFiles();
		for (File file2 : file1) {
			System.out.println(file2.getPath());
			boolean a=file.delete();
		}
		
		
	}

}
