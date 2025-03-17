package com.java8;

import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
import java.util.stream.*;

public class StreamDemo1 {
public static void main(String args[])
{
//	List<Integer> l=Arrays.asList(4,5,6,7,8,12, 12, 14, 98);
//	List<Integer> l=Arrays.asList(1,2,3,4,5,6);
	//Stream<Integer>s=l.stream();
	//s.forEach(x->System.out.println(x));
	//s.forEach(System.out::println);
//	l.stream().forEach(x->System.out.println(x));
//	l.stream().forEach(System.out::println);
//	int s=l.stream().filter(x->x>4).mapToInt(x->x).distinct().sum();
//	System.out.println("sum is"+s);
//	System.out.println(l.stream().filter(x->x%2==0).distinct().count());
//    List<String> l2 = Arrays.asList("Ann", "Benn", "Ken");
//    l2.stream().map(x->x.toUpperCase()).filter(x->x.contains("E")).forEach(System.out::println);
    //l2.stream().map(String::toUpperCase).filter(System.out::println);
	
//	int sum = l.stream().reduce(0, (a,b) -> a +b);
//	System.out.println(sum);
	
	// to convert array to a string use Arrays.stream or Stream.of
	
//	Stream<String> streamOf = Stream.of("one", "two", "three");
	
	// allMatch, anyMatch and nullMatch
//	List<String> stringList = new ArrayList<String>();
//
//	stringList.add("One flew over the cuckoo's nest");
//	stringList.add("To kill a muckingbird");
//	stringList.add("Gone with the wind");
//
//	Stream<String> stream = stringList.stream();
//
//	boolean allMatch = stream.anyMatch((value) -> { return value.startsWith("One"); });
//	System.out.println(allMatch);

	
	// COLLECT
//	List<String> stringList = new ArrayList<String>();
//
//	stringList.add("One flew over the cuckoo's nest");
//	stringList.add("To kill a muckingbird");
//	stringList.add("Gone with the wind");
//
//	Stream<String> stream = stringList.stream();
//
//	List<String> stringsAsList = stream.collect(Collectors.toList());
//
//	System.out.println(stringsAsList);

//	class Empl {
//	    int id;
//	    String name;
//
//	    Empl(int id, String name) {
//	        this.id = id;
//	        this.name = name;
//	    }
//	}
//
//	public class ListToMap {
//	    public static void main(String[] args) {
//	        List<Empl> employees = Arrays.asList(
//	            new Empl(1, "John"),
//	            new Empl(2, "Jane"),
//	            new Empl(3, "Jack")
//	        );
//
//
//	        Map<Integer, String> employeeMap = employees.stream()
//	            .collect(Collectors.toMap(emp -> emp.id, emp -> emp.name));
//
//	        System.out.println(employeeMap);
//	    }
//	}
	
	// findFirst & findAny
	
	List<String> stringList = new ArrayList<String>();

	stringList.add("okay");
	stringList.add("two");
	stringList.add("three");
	stringList.add("one");

	Stream<String> stream = stringList.stream();

	Optional<String> anyElement = stream.findFirst();

	System.out.println(anyElement.get());


}
}

