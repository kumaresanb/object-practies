package com.evolvus.java.object.practies.equals;

class B {
	int i;

	B(int i) {
		this.i = i;
	}
}

public class Manager2 {
	public static void main(String[] args) {
		B b1=new B(80);
		B b2=b1;
		B b3= new B(80);
		B b4=b3;
		System.out.println(b1==b2);
		System.out.println(b2==b3);
		System.out.println(b3==b4);
		System.out.println(b1.i==b3.i);
	}
}
