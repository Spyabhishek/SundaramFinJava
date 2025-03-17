package com.generics;

import java.util.*;
class Student
{
	private int id;
	private String name;
	private String College;
	public Student(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		College = college;
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
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", College=" + College + "]";
	}
	
	
	
	
	
}
public class GenericsDemo {

	static List<String> displayList(List<Student> list)
	{
		List<String> stringList=new ArrayList();
		for(Student s:list)
		{
			stringList.add(s.getName());
		}
		return stringList;
		
	}
	public static void main(String[] args) {
		List<Student> l=new ArrayList();
		Student s1=new Student(10,"ann","UVCE");
		Student s2=new Student(11,"bann","UVCE");
		Student s3=new Student(12,"kann","UVCE");
		l.add(s1);l.add(s2);l.add(s3);
		l.add(new Student(13,"ren","bcdb"));
		List<String> l1=displayList(l);
		for(String  x:l1)
		{
			System.out.println(x);
		}
	}

}

