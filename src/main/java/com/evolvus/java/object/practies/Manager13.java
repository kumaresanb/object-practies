package com.evolvus.java.object.practies;

class A1 {
	 private int i = 20;

	@Override
	public String toString() {
		return Integer.toString(i);
	}
}

class B1 {
	private int j = 30;
	A1 a1 = new A1();

	@Override
	public String toString() {
		return "B1 J:" +  j + ",A1 reference:" + a1;
	}
}

public class Manager13 {
	public static void main(String[] args) {
		B1 b1=new B1();
		System.out.println(b1);
	}
}
