package com.luoamin.datastruct;
/**
 * 利用数组实现队列
 * @author john
 *
 */
public class QueueList implements Queue {
	public final int defaultSize=10;
	public int head;//队列头的位置
	public int foot;//队列尾的位置
	public int maxSize;//队列的最大存储个数
	Object[] queue;
	public QueueList(){
		init(defaultSize);
	}
	public QueueList(int size){
		init(size);
	}
	public void init(int size){
		maxSize=size;
		head=0;
		foot=0;
		queue=new Object[size];
	}
	@Override
	/*在队尾插入元素*/
	public void insert(Object obj)throws Exception {
		if(foot>maxSize){
			throw new Exception("队列已满！");
		}
		queue[foot]=obj;
		foot++;
	}
	@Override
	/*在队头删除元素*/
	public Object pop()throws Exception {
		if(head==0){
			throw new Exception("队列为空！，不能删除");
		}
		head++;
		return queue[head];
	}
	@Override
	//获取队头元素
	public Object getHead()throws Exception {
		return queue[head];
	}
	@Override
	//获取队尾元素
	public Object getFoot() throws Exception {
		return queue[foot];
	}
	@Override
	/*判断队列是否为空*/
	public boolean isEmpty()throws Exception {
		return head==0;
	}
	@Override
	/*判断队列是否已满*/
	public boolean isFull() throws Exception {
		return foot==maxSize;
	}
	
	
	

}
