package com.luoamin.io.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
	/**
	 * 该方法是输出文件夹下面所有的文件，不管里面有几层文件夹
	 * map可以不要，多余
	 * */
public class TestFile {
	public static void  listfile(File file,Map<String,String>map){
		  //如果file代表的不是一个文件，而是一个目录
        if(!file.isFile()){
            //列出该目录下的所有文件和目录
            File files[] = file.listFiles();
            //遍历files[]数组
            for(File f : files){
                //递归
               listfile(f,map);
            }
        }else{
        	System.out.println(file);
        }

	}
	
	
	public static void main(String[] args) {
		File file=new File("D:/luoamin/测试");
		Map<String,String> map=new HashMap<String, String>();
		listfile(file,map);
		
	}

}
