package com.evolvus.java.object.practies.equals;

class E {
	int h;

	E(int h) {
		this.h = h;
	}

	@Override
	public String toString() {
		return "H:" + h;
	}

	@Override
	public boolean equals(Object obj) {
		E e1 = (E) obj;//Down casting  
		return this.h == h;
	}
}

public class Manager5 {
	public static void main(String[] args) {
		E e1=new  E(130);
		E e2=new  E(130);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
	}
}
