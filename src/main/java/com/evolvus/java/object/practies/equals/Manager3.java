package com.evolvus.java.object.practies.equals;

class C {
	int j;

	C(int j) {
		this.j = j;
	}
}

public class Manager3 {
	public static void main(String[] args) {
		C c1 = new C(120);
		C c2 = new C(120);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
	}
}
