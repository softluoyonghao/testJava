package com.luoamin.reflect;

import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Person {
	private String name;
	private Integer age;
	public Person(){}
	private Person(String name,Integer age){
		this.name=name;
		this.age=age;
	}
	
	public void fff(String name){
		System.out.println(name+"你好帅！");
	}
	
	public static void main(String[] args) throws Exception {
		/**实例化Class类对象的四种方法*/
		Teacher  te=new Teacher();
		Class<Teacher> cc=Teacher.class;
		System.out.println(cc);//class com.luoamin.reflect.Teacher
		
		Class c2=Class.forName("com.luoamin.reflect.Teacher");
		System.out.println(c2);
		
		Class c3="com.luoamin.reflect.Teacher".getClass();//class java.lang.String
		System.out.println(c3);
		
		Class c4=te.getClass();
		System.out.println(c4);
		ClassLoader  load=te.getClass().getClassLoader();//getClassLoader是Class对象的方法
		Class c5=load.loadClass("com.luoamin.reflect.Teacher");
		System.out.println(c5);
		
		
		//获取Class对象反射的对象实例，即Teacher对象，这种情况新建的对象有两个条件
		//1.加载的类必须有无参构造方法；2，构造方法有一定的访问权限
		Object obj=cc.newInstance();
		System.out.println(obj);//techer对象
		
		
		/**
		 * 另外的class反射对象实例化方法，同样可以实例化Teacher对象
		 * getConstructor里面是一个class类型的数组,如果不写泛型
		 * 也可以，newInstance方法就得墙纸转换成Teacher类型
		 * 
		 * 调用getMethod方法，和getConstructor方法为Class类主要方法
		 */
		Constructor<Teacher>tea= cc.getConstructor(String.class,Integer.class);
		Field ff=cc.getField("name1");
		System.out.println(cc.getName());
		System.out.println(cc.getSuperclass());//返回Class类型的父类，即object类
		Class[] cal= String.class.getInterfaces();//getInterfaces返回String类实现的接口
		for (Class class1 : cal) {
			System.out.println(class1);
		}
		System.out.println(ff);
		Teacher tt=tea.newInstance("laoluo",20);
		System.out.println(tt);
		tt.fly("laile");
		
		
		
		Properties  p=new Properties();
		//文件路径里面的/表示classpath路径，即程序编译后的bin目录，如果没有/，那么就是代表和源文件是统一路径
		p.load(new InputStreamReader(Person.class.getResourceAsStream("Amin.properties"), "utf-8"));
		System.out.println(p.getProperty("luoamin"));
		
		//获取反射类的构造函数
		Constructor con=Teacher.class.getDeclaredConstructor(new Class[]{String.class});
		System.out.println(con.getName()+"++++++++");
		con.setAccessible(true);
		//newInstance返回的是object类型对象，其实根据反射也就是Teacher对象，即通过反射创建一个对象，参数也可以写成//“airen”
		Teacher teacher=(Teacher)con.newInstance(new Object[]{"airen"});
		System.out.println(teacher.name1);
		
		
		
		
		
		Method me=Teacher.class.getDeclaredMethod("fly", new Class[]{String.class});
		//Declared通过这个方法并且这只这个属性为true就可以访问任何权限的方法
		me.setAccessible(true);
		//getName获取方法名字，getModifiers获取方法的访问权限的int值
		System.out.println(me.getName()+"++++++"+me.getModifiers());
		//直接调用反射获取过来的方法
		Object vv=me.invoke(new Teacher(), new Object[]{"amin"});
		System.out.println(vv);//输出method里面的内容，包括返回值
	}
	
}
class Teacher{
	public String name1;
	private Integer age;
	public  Teacher(){};
	public Teacher(String name){
		this.name1=name;
	}
	public Teacher(String name,Integer age){
		this.name1=name;
		this.age=age;
	}
	public String  fly(String name){
		System.out.println("我要飞得更高"+name);
		return "火上房";
	}
	
}