package testJva;
/**
 * 
 *一个class文件可以有多个以上的类，但只有一个用public修饰，
 */
  class TestTwoClass {
  public int getNumber(int a){
	  return a+1;
  }
}


class B extends   TestTwoClass{
	public int getNumber(int a, char c){
		return a+2;
	}
	
	public static void main(String[] args) {
		B   b=new B();
		System.out.println(b.getNumber(0));
	}
}