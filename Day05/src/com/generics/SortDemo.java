package com.generics;

import java.util.*;
public class SortDemo {

	public static void main(String[] args) {
//		List<String> l=Arrays.asList("ben","den","ann");
		List<Integer> l=Arrays.asList(100, 27, 13, 41, 5);
		Collections.sort(l);
		System.out.println(l);

	}

}

