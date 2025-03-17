package com.first;
// Initialise class
class Hello{
	int id;
	String name;
	String state;
	
	// Constructor
	public Hello(int id, String name, String state) {
		this.id=id;
		this.name=name;
		this.state=state;
	}
	
	// method
	public void details() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(state);
	}
	
}


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h = new Hello(101, "sadf", "sefw");
//		h.id=101;
//		h.name="spy";
//		h.state="Bihar";
		h.details();

	}

}
