package com.luoamin.datastruct;

public class TestSequenList {
	
	public static void main(String[] args) {
		List list=new SequenList(10);
		list.getSize();
		list.isEmpty(list.getSize());
		try {
			list.insert(0, new String("dsfsdf"));
			list.insert(1, new String("dsfdf"));
			list.insert(2, new String("我爱你"));
			list.insert(3, new String("大炮"));
			list.insert(4, new String("男人"));
			list.getSize();
			list.delete(4);
			list.update(10, new String("快来啊"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
