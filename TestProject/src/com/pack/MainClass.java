package com.pack;

public class MainClass {

	public int addMeth(int x,int y)
	{
		return x+y;
	}
	
	public boolean checkString(String s)
	{
		if(s.length()%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	public int methodForException(String s)
//	{
//		if(s==null||s.trim().length()==0)
//		{
//			throw new IllegalArgumentException("check string for not null");
//		}
//		return Integer.valueOf(s);
//	}

}