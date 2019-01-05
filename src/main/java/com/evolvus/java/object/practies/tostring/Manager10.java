package com.evolvus.java.object.practies.tostring;

public class Manager10 {
	public static void main(String[] args) {
		String s1="hello@123";
		int j=s1.indexOf('@');
		System.out.println(j);
		String s2=s1.substring(j+1);
		System.out.println(s2);
	}
}
