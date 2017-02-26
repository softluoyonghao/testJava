package com.luoamin.io;

import java.io.FileInputStream;
import java.io.FileReader;

public class InputStreamTest {
    /**
     * 使用FileInputStream读取该类本身
     * */
    public static void FileInputStreamTest() throws Exception{
        FileInputStream fis = null;
        try{
        //创建字节输入流
        fis = new FileInputStream("src/xidian/sl/io/InputStreamTest.java");
        //创建一个长度为1024的字节数组来存取
        byte[] bbuf = new byte[1024];
        //用于保存实际读取的字节数
        int hasRead = 0;
        //使用循环来进行重复读取
        while((hasRead = fis.read(bbuf))> 0){
            //取出字节，将字节数组转化为字符串输出
            System.out.println(new String(bbuf, 0 , hasRead));
        }
        }finally{
            //关闭文件输入流
            fis.close();
        }
    }
    /**
     * 使用FileReader读取该类本身
     * */
    public static void FileReaderTest() throws Exception{    
        FileReader fr = null;
        try{
        //创建字节输入流
        fr = new FileReader("src/xidian/sl/io/InputStreamTest.java");
        //创建一个长度为1024的字节数组来存取
        char[] bbuf = new char[40];
        //用于保存实际读取的字节数
        int hasRead = 0;
        //使用循环来进行重复读取
        while((hasRead = fr.read(bbuf))> 0){
            //取出字节，将字节数组转化为字符串输出
            System.out.println(new String(bbuf, 0 , hasRead));
        }
        }finally{
            //关闭文件输入流
            fr.close();
        }
    }
    public static void main(String[] args) throws Exception{
        InputStreamTest.FileInputStreamTest();
        InputStreamTest.FileReaderTest();
    }
}