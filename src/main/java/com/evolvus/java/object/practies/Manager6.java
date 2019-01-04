package com.evolvus.java.object.practies;

class Person {
	String name = "Ramesh";
	int age = 40;
	@Override
	public String toString() {
		return "Name:"+name+",Age:"+age;
	}
}

public class Manager6 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
	}
}
