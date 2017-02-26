package com.luoamin.factory.simplefactory;

public class Test {
	public static void main(String[] args) {
		/*简单工厂模式
		 * 简单工厂模式有基点要素
		 * 1.抽象角色（car，接口）,2.具体角色（Benchi,Baoma..）,3.管理具体角色的人员（司机，即 factory类）
		 * 4.客户端，负责运行
		 * */
		
		Car bao=Driver.getCar("Baoma");
		bao.drive();
	}

}
