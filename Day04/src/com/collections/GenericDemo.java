package com.collections;
import java.util.*;
public class GenericDemo {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(3);
		l.add(5);
		l.add(8);
		for(Integer x:l)
		{
			System.out.println(x);
		}
	}
}