package com.luoamin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FolderOperator {
	  private static void copyDir(String source1, String target1) throws IOException {
          File source = new File(source1);
          File target = new File(target1);
          target.mkdirs();
          File[] files = source.listFiles();
          for(int a=0;a<files.length;a++){
              if(files[a].isFile()){
                  File target2 = new File(target,files[a].getName());
                  copyFile(files[a], target2);
              }
              if(files[a].isDirectory()){
                  String source3 = source1 +File.separator + files[a].getName();
                  String target3 = target1 +File.separator + files[a].getName();
                  //递归,对还是文件夹的文件夹在调用copyDir的方法,上面的if条件是递归的出口
                  copyDir(source3,target3);
              }
          }
  }

  private static void copyFile(File file, File target)
          throws IOException {
      BufferedInputStream bis = new BufferedInputStream(
              new FileInputStream(file));
      BufferedOutputStream bos = new BufferedOutputStream(
              new FileOutputStream(target));
      byte[] buf = new byte[1024];
      int len = 0;
      while((len=bis.read(buf))!= -1){
          bos.write(buf, 0,len);
      }
      bis.close();
      bos.close();
  }
	public static void main(String[] args) throws IOException {
		  //需要被复制文件夹的位置
        String url1 = "c:" + File.separator + "source";
        //最后被复制的文件夹
        String url2 = "d:" + File.separator + "copy";
        //将这2个文件夹包装成File对象
        File file1 = new File(url1);
        File file2 = new File(url2);
        //创建目标文件夹
        file2.mkdirs();
        //对源文件夹进行遍历
        File[] files = file1.listFiles();
        for (int a = 0; a < files.length; a++) {
            //是标准文件,我们就直接进行复制动作
            if (files[a].isFile()) {
                //确认目标文件的需要被复制到的位置,它肯定是在目标文件夹下面
                File target = new File(file2, files[a].getName());
                copyFile(files[a], target);
            }
            if(files[a].isDirectory()){
                //文件夹下面还是个文件夹,这个时候去拿到文件夹的路径
                String source1 = url1+File.separator+files[a].getName();
                String target1 = url2+File.separator+files[a].getName();
                copyDir(source1,target1);
            }
        }
	}
}
