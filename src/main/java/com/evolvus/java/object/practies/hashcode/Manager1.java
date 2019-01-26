package com.evolvus.java.object.practies.hashcode;

class A {
	int i;
	double j;
	String str1;

	A(int i, double j, String str1) {
		this.i = i;
		this.j = j;
		this.str1 = str1;
	}

	@Override
	public int hashCode() {
		return (Integer.toString(i)).hashCode() + (Double.toString(j)).hashCode() + str1.hashCode();
	}

}

public class Manager1 {

	public static void main(String[] args) {
		A a1 = new A(12, 23.45, "Hello");
		A a2 = new A(12, 23.45, "Hello");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}

}
