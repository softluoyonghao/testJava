package com.luoamin.proxy;

public class TunkProxyTime implements Moveable{
	private Moveable  mo;//聚合的方式
	public TunkProxyTime(Moveable  m){
		this.mo=m;//将代理对象指向要代理的对象Moveable  m=new Tunk();
		//相当于在初始化代理对象的时候传一个实体对象，可以调用实体对象的方法
	}
	@Override
	public void move() {
		long start=System.currentTimeMillis();
		mo.move();
		long end= System.currentTimeMillis();
		System.out.println("坦克行驶时间为"+(end-start));
	}
	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}

}
