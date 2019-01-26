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
	}

}
