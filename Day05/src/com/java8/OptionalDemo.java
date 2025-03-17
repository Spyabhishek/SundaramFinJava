package com.java8;

import java.util.Optional;

//public class OptionalDemo {
//
//	public static void main(String[] args) {
//		String name=null;
//		Optional<String> s=Optional.ofNullable(name);
//	if(s.isPresent())
//	{
//		System.out.println(s.get());
//	}
//	else
//	{
//		System.out.println("not found");
//	}
//System.out.println("hello");
//
//	}
//
//}

public class OptionalDemo {
    public static void main(String[] args) {
        // Create an empty Optional
        Optional<String> emptyOptional = Optional.empty();
        
        // Check if the Optional is empty
        if (emptyOptional.isEmpty()) {
            System.out.println("The Optional is empty!");
        } else {
            System.out.println("The Optional contains a value.");
        }
    }
}