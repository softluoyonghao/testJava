package com.luoamin.reflect.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.luoamin.reflect.Person;

public class TestPerson {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, UnsupportedEncodingException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class cla=Person.class;
		Class[] aa=String.class.getClasses();
		for(Class list:aa){
			System.out.println(list);
		}
		
		cla.newInstance();
		Constructor<Person> person=cla.getDeclaredConstructor(new Class[]{String.class,Integer.class});
		System.out.println(person);
		person.setAccessible(true);
		System.out.println(cla);
		Object oo=person.newInstance(new Object[]{"amin",20});
		
		
		Method me=cla.getDeclaredMethod("fff", new Class[]{String.class});
		me.invoke(new Person(), new Object[]{"amin"});
		
		
		
	}

}
