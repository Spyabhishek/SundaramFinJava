package com.exceptions;

public class ThrowDemo {
static void meth()
{
System.out.println("welcome to meth");	
throw new ArithmeticException("demo");
}
public static void main(String args[])
{
	meth();
	System.out.println("hello");
}
}

