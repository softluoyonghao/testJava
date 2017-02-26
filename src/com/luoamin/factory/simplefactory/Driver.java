package com.luoamin.factory.simplefactory;
/**
 * 司机，专门给老板开车的，也是管理车的
 * @author john
 *
 */
public class Driver {
	public static  Car getCar(String carName){
		Car car=null;
		if(carName.equals("Baoma")){
			car=new Baoma();
		}else if(carName.equals("Benchi")){
			car=new Benchi();
		}else{
			car=new Audi();
		}
		return car;
	} 

}
