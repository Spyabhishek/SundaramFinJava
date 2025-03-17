package com.collections;

import java.util.*;
import java.util.Set;

public class SetDemo {
	public static void main(String[]args) {
		Set s =new HashSet();
		s.add("ben");
		s.add("ken");
		s.add("ann");
		s.add("zen");
		System.out.println(s);
		System.out.println(s.contains("ann"));
	}
}
