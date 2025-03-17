package com.collections;

import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		List l=new ArrayList();
		
		l.add(3);
		l.add(4.1f);
		l.add("ann");
		l.add(1, "ben");
		l.add("ann");
		l.set(3,"ken");
		//System.out.println(l.contains("ann"));
		//System.out.println(l);
		System.out.println("iterating thr' enhanced for loop");
		for (Object s:l)
		{
			System.out.println(s);
		}
		System.out.println("using normal forloop");
		for(int i=0;i<l.size();i++)
{
	System.out.println(l.get(i));
}
		System.out.println("iterator method");
		Iterator i1=l.iterator();
		while(i1.hasNext())
		{
			Object o=i1.next();
			System.out.println(o);
		}
	
	}

}