package com.luoamin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class OutputStreamTest {
    /**
     * 使用字节流输出
     * */
    public static void FileOutputStreamTest() throws Exception{
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            //创建字节输入流
            fis = new FileInputStream("src/xidian/sl/io/InputStreamTest.java");
            //创建字节输出流
            fos = new FileOutputStream("src/xidian/sl/io/Output.txt");
            byte[] bt = new byte[40];
            int hasRead = 0;
            //循环从输入流中读取数据
            while((hasRead = fis.read(bt))> 0){
                //每读取一个，即写入文件输出流，读了多少就写多少
                fos.write(bt, 0, hasRead);
            }
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            /**
             * 流在关闭时会自动执行flash，将缓冲中的数据flush到物理节点中
             * 所以关闭时很重要的
             * */
            if(fis != null){
                fis.close();
            }
            if(fos != null){
                fos.close();
            }
        }
    }
    /**
     * 使用字符流输出字符串会显得比较的方便
     * */
    public static void FileWriteTest() throws Exception{
        FileWriter fw = null;
        try{
            //创建字节输出流
            fw = new FileWriter("src/xidian/sl/io/Output.txt");
            fw.write("温州医学院\r\n");
            fw.write("信息与管理专业\r\n");
            fw.write("温州医学院\r\n");
            fw.write("温州医学院\n");
            fw.write("温州医学院");
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(fw != null){
                fw.close();
            }
        }
    }
    public static void main(String[] args) throws Exception{
        OutputStreamTest.FileOutputStreamTest();
        OutputStreamTest.FileWriteTest();
    }
}