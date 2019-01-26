package com.evolvus.java.object.practies.clone;

class B implements Cloneable {
	int i;

	B(int i) {
		this.i = i;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Manager2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		B b1=new B(20);
		B b2 =(B)b1.clone();
		System.out.println(b2.i);
	}
}
