package com.evolvus.java.object.practies.tostring;

class B{
	int i=20;
}

public class Manager3 {
    public static void main(String[] args) {
		B b1=new B();
		String s1=b1.toString();
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(s1.toString());
	}
}
