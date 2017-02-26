package com.luoamin.test;

class A
{     int x,y;
     static float f(int a){return 0;}
     float g(int x,int y){return 0;}
}
class B
{   public static void main(String args[])
    {  A a1=new A();
      A.f(2);        //合法。
      a1.f(2);       //合法。
      a1.g(2,5);      //合法。
      A.g(3,2);      //非法。
    }
}