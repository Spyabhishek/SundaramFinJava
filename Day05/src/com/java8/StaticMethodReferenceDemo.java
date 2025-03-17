package com.java8;

import java.util.function.*;;
public class StaticMethodReferenceDemo 
{
	static int  meth(int x,int y)
	{
		return x+y;
		
	}

	public static void main(String[] args) {
		//using lambda expression
		Function<Integer,Double> fun=(n)-> Math.sqrt(n);
		System.out.println(fun.apply(4));
		
		//using method referenece
		Function<Integer,Double> fun1= Math::sqrt;
		System.out.println(fun1.apply(4));
		
		
		//using lambda expression
		BiFunction<Integer,Integer,Integer> fun2=(a,b)->StaticMethodReferenceDemo.meth(a, b);
		System.out.println(fun2.apply(3, 4));
		
		//using method referenece
		BiFunction<Integer,Integer,Integer> fun3=StaticMethodReferenceDemo::meth;
		System.out.println(fun3.apply(3, 4));

	
	}

}