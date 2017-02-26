package com.luoamin.sorted;
/**
 * 冒泡排序
 * @author john
 *
 */
public class BulbleSorted {
	public static void main(String[] args) {
		int []a={12,9,108,50,88,77,89,60};
		sort(a);
		for(int b:a){
			System.out.println(b);
		}
	}
	
	public static void sort(int []a){//数组总共有8个数据,每进行一轮排序就会在最后产生一个最大的数，下一轮就不用比较最后一个数了
		int temp;
		for(int i=0;i<a.length-1;i++){//需要比较a.length-1轮
			for(int j=0;j<a.length-i-1;j++){//第一轮要比较7次，第二轮要比较6次，所以每轮比较a.length-i-1次
				if(a[j]>a[j+1]){//只要前面的数据比后面的数据大，就掉换两者的位置
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
