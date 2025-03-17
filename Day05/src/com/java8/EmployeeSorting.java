package com.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee1
{
	int id;
	String name;
	long salary;
	public Employee1(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class EmployeeSorting {

	public static void main(String[] args) {
		Employee1 obj1=new Employee1(10,"ann",4000L);
		Employee1 obj2=new Employee1(11,"bann",24000L);
		Employee1 obj3=new Employee1(12,"cann",14000L);
		Employee1 obj4=new Employee1(13,"dann",34000L);
		
		List<Employee1> list=new ArrayList();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
//		List<String> l1=Arrays.asList("ann","beeenu","jeenu");
//		Map<String,Integer>m=l1.stream().collect(Collectors.toMap(String::new,String::length));
//		for(Map.Entry<String,Integer > m1:m.entrySet())
//		{
//			System.out.println(m1.getKey()+"  "+m1.getValue());
//		}
		
		
	System.out.println("sorting by anonymous class on salary");
	list.stream().sorted(new Comparator<Employee1>() {
		public int compare(Employee1 o1,Employee1 o2)
		{
			return (int)(o1.getSalary()-o2.getSalary());
			
		}
	}).forEach(System.out::println);
	
	list.stream().sorted(new Comparator<Employee1>() {
		
		public int compare(Employee1 e1,Employee1 e2)
		{
			return(int)(e1.getSalary()-e2.getSalary());
		}
		
	}).forEach(System.out::println);
	System.out.println("sorting by anonymous class on name");
	list.stream().sorted(new Comparator<Employee1>() {
		public int compare(Employee1 o1,Employee1 o2)
		{
			return (int)(o1.getName().compareTo(o2.getName()));
			
		}
	}).forEach(System.out::println);
	
	
	System.out.println("sorting on salary by lambda expression");
	
	list.stream().sorted(
		( o1, o2)->
		{
			return (int)(o1.getSalary()-o2.getSalary());
			
		}
	).forEach(System.out::println);
	list.stream().sorted((o1,o2)->
	{
		return (int)(o1.getName().compareTo(o2.getName()));
	}
			).forEach(System.out::println);
	
		
		Stream<Employee1>obj=list.stream();
		obj.sorted(Comparator.comparingLong(Employee1::getSalary).reversed()).forEach(System.out::println);
	System.out.println("sorting on name by method reference");
	list.stream().sorted(Comparator.comparing(Employee1::getName).reversed()).forEach(System.out::println);
		
				
		
			Employee1 e=list.stream().filter(x->x.getSalary()>10000).findAny().get();
	long l=list.stream().filter(x->x.getSalary()>20000).map(x->x.getSalary()+3000).count();
	System.out.println(e);
	System.out.println(l);
	Optional<Employee1>  e4=list.stream().min
			(Comparator.comparingLong(Employee1::getSalary));
	if(e4.isPresent())
	{
		Employee1 obj31=e4.get();
		System.out.println("lowest paid emp"+obj31);
	}
Optional<Employee1> l2=	list.stream().max(Comparator.comparingLong(Employee1::getSalary));
	
	}
	*/
	}
}


