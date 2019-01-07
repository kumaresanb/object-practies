package com.evolvus.java.object.practies.equals;

class J {
	 int j;

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof J)) {
			return false;
		}
		return j == ((J) obj).j;
	}
}

public class Manager8 {
	public static void main(String[] args) {
		J j1=new J();
		j1.j=200;
		J j2=new J();
		j2.j=200;
		System.out.println(j1.equals(j2));
		Object obj=new Object();
		System.out.println(obj.equals(j1));
		String s1 ="abc";
		System.out.println(s1.equals(j2));
	}
}
