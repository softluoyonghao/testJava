package com.luoamin.xml.sax;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxXmlParse {
	 private static SAXParser mParser;  
	  
	    /**  
	     * @param args  
	     */  
	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        saxParserXml();  
	    }  
	  
	    /**  
	     * SAX解析XML文件采用事件驱动的方式进行，SAX是逐行扫描文件，  
	     * 遇到符合条件的设定条件后就会触发特定的事件，回调你写好的事件处理程序（Hanlder）  
	     */  
	    private static void saxParserXml() {  
	        // TODO Auto-generated method stub  
	        try {  
	            //1.获取sax解析器的工厂对象  
	            SAXParserFactory mParserFactory = SAXParserFactory.newInstance();  
	            // 2.通过工厂对象 mParserFactory创建解析器对象mParser  
	            mParser = mParserFactory.newSAXParser();  
	            //3.创建事件处理器对象mHanlder  
	            Hander mHanlder = new Hander();  
	            //4.利用指定处理器解析指定文件  
	            mParser.parse(Constant.PARSER_XML_DIR + File.separator + "test.xml", mHanlder);  
	        } catch (Exception e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	    }  
}
