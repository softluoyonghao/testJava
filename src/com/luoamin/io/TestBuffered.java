package com.luoamin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffered {
	
	
	public static void fileOperator(){
		BufferedReader  re  =null;
		BufferedWriter  w=null;
		try {
			re=new BufferedReader(new FileReader("d:/abc.txt"));
			w=new BufferedWriter(new FileWriter("e:/abc.txt"));
			char []buff=new char[50];
			int stream=0;
			while((stream=re.read(buff))>0){
				w.write(buff, 0, stream);
				w.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				w.close();
				re.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		 
	}
	
	
	public static void main(String[] args) {
		fileOperator();
	}

}
