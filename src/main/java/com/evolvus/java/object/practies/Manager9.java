package com.evolvus.java.object.practies;

class F {
	private int i;

	F(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		String s1 = super.toString();
		s1 = s1.substring(s1.indexOf('@') + 1);
		return s1 + ",i=" + i;
	}
}

public class Manager9 {
	public static void main(String[] args) {
		F f1=new F(100);
		F f2=new F(200);
		F f3=new F(300);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
	}
}
