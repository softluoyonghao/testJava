package com.luoamin.xml.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Hander extends DefaultHandler{
	 private boolean isTest = false;  
	  
	    public Hander() {  
	    }  
	  
	  
	    /** 
	     * 开始节点，根据开始节点名建立相关条件或创建相关对象 
	     * */  
	    public void startElement(String uri, String localName, String qName,  
	            Attributes attributes) throws SAXException {  
	        super.startElement(uri, localName, qName, attributes);  
	  
	        if ("tests".equals(qName)) {  
	            isTest = true;  
	        } else if ("test".equals(qName)){  
	            System.out.println("parser test start");  
	        }  
	  
	    }  
	  
	    /** 
	     * 结束节点，根据结束节点完成相关动作 
	     * */  
	    public void endElement(String uri, String localName, String qName)  
	            throws SAXException {  
	        super.endElement(uri, localName, qName);  
	  
	        if ("tests".equals(qName)) {  
	            isTest = false;  
	        }  
	        System.out.println("parser test end");  
	    }  
	  
	    /** 
	     * 节点间的文字信息，可通过stringbuffer收集每一个节点的文字信息， 
	     * 在endElement中清空stringbuffer，收集下一个 
	     * */  
	    public void characters(char[] ch, int start, int length)  
	            throws SAXException {  
	        super.characters(ch, start, length);  
	        String content = new String(ch, start, length);  
	        System.out.println("content = " + content);  
	  
	    }  
}
