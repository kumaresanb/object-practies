package com.evolvus.java.object.practies.equals;

class A1 {

}

class B1 extends A1 {

}

public class Manager11 {
	public static void main(String[] args) {
		A1 a1=new A1();
		B1 b1=new B1();
		System.out.println(a1==b1);
		
		A1 a2=new A1();
		A1 a3=new A1();
		System.out.println(a2==a3);
		
	}
}
