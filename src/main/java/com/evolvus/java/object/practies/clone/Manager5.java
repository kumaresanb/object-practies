package com.evolvus.java.object.practies.clone;

class E implements Cloneable {
	int k;

	E(int k) {
		this.k = k;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Manager5 {

	public static void main(String[] args) {
		E e1 =new E(34);
		E e2=e1;
		System.out.println(e2.k);
		e2.k=200;
		System.out.println(e1.k);
		e1.k=300;
		System.out.println(e1.k);
		System.out.println(e1==e2);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
