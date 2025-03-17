package com.exceptions;

public class ThrowsDemo {
static void meth()throws ArithmeticException
{
System.out.println("welcome to meth");	
throw new ArithmeticException("demo");
	
}
public static void main(String args[])
{try {
	meth();
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("hello");
}
}