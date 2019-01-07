package com.evolvus.java.object.practies.equals;

class D {
	private int k;

	D(int k) {
		this.k = k;
	}

	@Override
	public String toString() {
		return "K:" + k;
	}
}

public class Manager4 {
	public static void main(String[] args) {
		D d1=new D(100);
		D d2=new D(100);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.equals(d2));
	}
}
