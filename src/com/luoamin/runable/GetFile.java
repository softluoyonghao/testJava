package com.luoamin.runable;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class GetFile {

	public static void fileDirectory(String directory) {
		File file=new File(directory);
		File[] list=file.listFiles();
		for(int i=0;i<list.length;i++){
			if(list[i].isFile()){
				System.out.println("文件名"+list[i].getName());
			}else{
				fileDirectory(list[i].getAbsolutePath());
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
