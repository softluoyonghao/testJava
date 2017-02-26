package com.luoamin.datastruct;
/**
 * 线性表的操作
 * @author john
 *
 */
public class SequenList implements List{
	public final int defaultSize=10;//默认线性表数据长度
	public int maxSize;//线性表最大长度，也叫线性表能够存储的数据长度
	public int size;//线性表的长度
	public Object[] listArray;//线性表数据，使用数组来实现
	public SequenList(){
		init(defaultSize);
	}
	public SequenList(int sz){
		init(sz);
	}
	public void init(int sz){
		maxSize=sz;
		size=0;
		listArray=new Object[sz];
	}
	public void insert(int i, Object obj) throws Exception {
		if(size==maxSize){
			throw new Exception("线性表已满，不能插入！");
		}
		if(i>size){
			throw new Exception("数组下标越界！");
		}
		//插入的时候是将插入之后的数据都向后移动一个位置，所以循环从前往后循环
		for(int j=size;j>i;j--){
			listArray[j]=listArray[j-1];
		}
		listArray[i]=obj;
		size++;
		
	}

	@Override
	public Object delete(int i) throws Exception {
		if(size==0){
			throw new Exception("线性表没有数据，不能删除！");
		}
		if(i>size-1){
			throw new Exception("数组下标越界！");
		}
		Object obj=listArray[i];
		//删除元素后面的数据每个都要往前移一个单位
		for(int j=i;j<size-1;j++){
			listArray[j]=listArray[j+1];
		}
		size--;
		return obj;
		
	}

	@Override
	public void update(int i, Object obj) throws Exception {
		if(size==0){
			throw new Exception("线性表没有数据，不能删除！");
		}
		if(i>size-1){
			throw new Exception("数组下标越界！");
		}
		listArray[i]=obj;
	}

	@Override
	public Object getData(int i) throws Exception {
		return listArray[i];
	}

	@Override
	public boolean isEmpty(int size) {
		return size==0;
	}

	@Override
	public int getSize() {
		return size;
	}

}
