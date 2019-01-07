package com.evolvus.java.object.practies.equals;

class A {
	int i = 10;
}

public class Manager1 {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		System.out.println(a1==a2);
		System.out.println(a1.i=a2.i);
	}
}
