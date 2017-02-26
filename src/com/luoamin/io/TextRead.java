package com.luoamin.io;
import java.io.*;
public class TextRead{

	public static void copyfile() throws IOException{
		
		
	}
	
	public static void filePrint(){
		 File fin,fout;  
		   BufferedReader bf = null;
		   PrintWriter pw = null;
		   try{
		    fin = new File("D:/abc.txt"); //注意文件与程序都要在同一个文件夹下。zzc.txt为要被复制的文件。
		    fout = new File("e:/abc.txt"); //如果没有会自动创建。
		    bf = new BufferedReader(new FileReader(fin));
		    pw = new PrintWriter(fout); //PrintWriter为打印流，也可以使用BufferedWriter.
		    String line = bf.readLine();
		    while(line!=null){
		    pw.println(line);
		     line = bf.readLine();
		    }
		   }catch(Exception e){
		    e.printStackTrace();
		   }finally{
		    try{
		    //关闭 文件。
		     if(bf!=null){
		      bf.close();
		      bf = null;
		     }
		     if(pw!=null){
		      pw.close();
		      pw = null;
		     }
		    }catch(Exception e){
		     e.printStackTrace();
		    }
		   }
		
	}
	
	
	
public static void main(String[] args) throws IOException{
	File file=new File("D:/abc.txt");
	String f=File.separator;//系统分隔符，此处运行的结果是\
	System.out.println(f);
}
}