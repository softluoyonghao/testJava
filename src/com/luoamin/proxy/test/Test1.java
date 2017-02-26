package com.luoamin.proxy.test;


public class Test1 {
	public static void main(String[] args) {
		/*先时间后日志，如果还要加上一个代理，那么久在添加一个代理类，一直通过implements Moable
		 * 接口来进行业务的先后代理
		 * */
		Car car=new Car();
		LogProy log=new LogProy(car);
		TimeProy proxy1=new TimeProy(log);
		
		proxy1.move();
	}
}
