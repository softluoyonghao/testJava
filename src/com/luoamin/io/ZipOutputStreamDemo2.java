package com.luoamin.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
  
/**
 * 一次性压缩多个文件
 * */
public class ZipOutputStreamDemo2{
   public static void main(String[] args) throws IOException{
	   File file = new File("d:" + File.separator +"hello.zip");
       ZipFile zipFile = new ZipFile(file);
       System.out.println("压缩文件的名称为：" + zipFile.getName());
    }
    
}