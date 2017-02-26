package testJva;

import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 * 改程序
 *
 */
public class TestInt {
	 public int count(){
	     return 1%9;
	   }
	   public static void main(String[]args){
		   
		   try{
			   PrintWriter out  =
			   new PrintWriter(new FileOutputStream("d:/abc.txt"));
			         String name="chen";
			         out.print(name);
			   }catch(Exception e){
			      System.out.println("文件没有发现！");
			   }
	   }

}
