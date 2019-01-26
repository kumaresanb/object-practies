package com.evolvus.java.object.practies.clone;

class A {
	int i;

	A(int i) {
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
/**
 * 
 * We  will get ClassNotSupportException we are not implement Cloneable interface
 *
 */
public class Manager {
	public static void main(String[] args) throws CloneNotSupportedException {
		A a1 = new A(10);
		A a2 = (A) a1.clone();
		System.out.println(a2.i);
	}
}
