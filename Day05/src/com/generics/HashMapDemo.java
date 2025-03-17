package com.generics;
import java.util.*;

//public class HashMapDemo {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		      HashMap<String, Integer> m = new HashMap<>();
//		      
//		      m.put("John", 25);
//		      m.put("Jane", 30);
//		      m.put("Jim", 35);
//		    
//		      System.out.println(m.get("John"));	      
//		      System.out.println(m.containsKey("Jim")); 
//		      System.out.println(m.size()); 
//		      
//		   }
//	}


class Person
{
	int id;
	String name;
	double salary;
	public Person(int id, String name, double salary) {
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class HashMapDemo {

	static void displayDetails(Map<Integer,Person> p)
	{
		for(Map.Entry<Integer, Person> m:p.entrySet())
		{
			System.out.println(m.getKey()+" :"+m.getValue());
		}
	}
	public static void main(String[] args) {
	Map<Integer,Person> m=new HashMap();
	Person p1=new Person(10,"ann",7000);
	Person p2=new Person(11,"bann",17000);
	Person p3=new Person(12,"kann",27000);
	m.put(p1.getId(),p1);
	m.put(p2.getId(),p2);
	m.put(p3.getId(),p3);
	displayDetails(m);
	}}