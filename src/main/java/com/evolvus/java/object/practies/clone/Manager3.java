package com.evolvus.java.object.practies.clone;

class C implements Cloneable {
	int i;

	C(int i) {
		this.i = i;
	}

	Object getCopy() throws CloneNotSupportedException {
		return clone();
	}
}

public class Manager3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		C c1=new C(12);
		C c2=(C)c1.getCopy();
		System.out.println(c2.i);
	}

}
