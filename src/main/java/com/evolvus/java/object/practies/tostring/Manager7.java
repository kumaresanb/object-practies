package com.evolvus.java.object.practies.tostring;

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee[Name:" + name + ",Age:" + age + "]";
	}
}

public class Manager7 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Kumar", 32);
		Employee emp2 = new Employee("Ravi", 30);
		Employee emp3 = new Employee("Ram", 30);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}
}
