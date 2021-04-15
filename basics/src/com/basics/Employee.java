package com.basics;
import com.tamuk.Data;

public class Employee extends Data{
	public int id = 123; // instance variales
	public static int id2 = 789; // static variables
	String name = "arun";
	
	public void info() {
		System.out.println("the value of id: " + id);
		System.out.println("the value of name: " + name);
		
	}
	
	public static void info2() {
		System.out.println("the value of id: " + id2);
		int c = 100;	
		System.out.println("the value of name: " + c);
	}
	
	public int add(int id) {
		int c = 20;   // local varaibles
		// id = 35;
		
		int d = id + c;
		System.out.println("The value of d: " + d);
		return d;
	
	}
	
	 public static void main(String[] args) { 
		  Employee name = new Employee();
		  System.out.println(name.name);
		  info2();
		  name.add(55);
		  
	  }
	 
}