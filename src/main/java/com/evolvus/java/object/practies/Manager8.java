package com.evolvus.java.object.practies;

class E {
	private int i;

	E(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return super.toString() + "i=" + i;
	}
}

public class Manager8 {
	public static void main(String[] args) {
		E e1=new E(10);
		E e2=new E(100);
		E e3=new E(200);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
