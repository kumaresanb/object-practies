package com.evolvus.java.object.practies.equals;

class F {
	private int i, j;

	F(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "i:" + i + " and " + "j:" + j;
	}

	@Override
	public boolean equals(Object obj) {
		return i == ((F) obj).i && j == ((F) obj).j;
	}
}

public class Manager6 {
	public static void main(String[] args) {
		F f1=new F(30,40);
		F f2=new F(30,40);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1.equals(f2));
	}
}
