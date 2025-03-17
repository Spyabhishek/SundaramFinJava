package com.first;

abstract class Shape1
{
	int length=10,breadth=5;	
	abstract void area(); 
	void meth() {System.out.println("hello");
	}
	
}
 class Rect extends Shape1{
	 void area() {
		 System.out.println(length*breadth);
	 }
	 void meth() {System.out.println("hello i am in rect");
}}
 class cuboid  extends Shape1{
	 int h=5;
	 void area() {
		 System.out.println(length*breadth*h);
	 }
}
public class AbstractDemo {
	public static void main(String args[])
{
	Shape1 s=new Rect();
	s.area();
	s.meth();
	 s=new cuboid();
		s.area();
}
}

//-------------------------------------------------------------------------
//Abstract class with constructor
//------------------------------------------------------------------
//package com.first;
//abstract class Cuboid3
//{
//	int l,b;
//	Cuboid3(int m,int n)
//	{
//		l=m;b=n;
//	}
//	abstract void area();
//	
//}
//
//
//public class AbstractConstructorDemo extends Cuboid3{
//	int h;
//	AbstractConstructorDemo(int a,int b,int c)
//	{
//		super(a,b);
//		h=c;
//		
//	}
//	void area() {
//		System.out.println(l*b*h);
//	}
//	public static void main(String[] args) {
//	Cuboid3 obj=new 	AbstractConstructorDemo(4,5,6);
//obj.area();
//	}
//
//}