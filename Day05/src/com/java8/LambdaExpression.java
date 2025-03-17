package com.java8;

//@FunctionalInterface
//interface i1
//{
//	void meth(int a,int b);
//
//}
///*
//class A implements i1
//{
//	public void meth()
//	{
//		System.out.println("hello");
//	}
//}
//*/
//public class LambdaExpression {
//
//	public static void main(String[] args) {
//		/*i1 obj=new i1()
//				{
//			public void meth()
//			{
//				System.out.println("hello");
//			}};*/
//		i1 obj=(  m, n)->	System.out.println("hello"+(m+n));
//		
//			
//		obj.meth(3,4);
//
//	}
//
//}


@FunctionalInterface
interface i1
{

	int meth(int a,int b);
	

}
/*
class A implements i1
{
	public void meth()
	{
		System.out.println("hello");
	}
}
*/
public class LambdaExpression {

	public static void main(String[] args) {
		/*i1 obj=new i1()
				{
			public void meth()
			{
				System.out.println("hello");
			}};*/
		i1 obj=(  m, n)->	{
			m++;n++;
			return(m+n);
		};
			
		System.out.println(obj.meth(13,14));

	}

}
