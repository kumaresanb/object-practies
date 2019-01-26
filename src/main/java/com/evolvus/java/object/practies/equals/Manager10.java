package com.evolvus.java.object.practies.equals;
class K{
	int i;
	@Override
	public String toString() {
		return Integer.toString(i);
	}
	
	@Override
	public boolean equals(Object obj) {
	if(!(obj instanceof K)) {
		return false;
	}
		return i==((K)obj).i;
	}
}
public class Manager10 {
	public static void main(String[] args) {
		K k1 =new K();
		K k2 =new K();
		k1.i=k2.i=100;
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k1.equals(k2));
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
	}
}
