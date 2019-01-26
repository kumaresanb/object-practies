package com.evolvus.java.object.practies.hashcode;

import java.util.HashSet;

class C {
	int i;

	C(int i) {
		this.i = i;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof C)) {
			return false;
		}
		System.out.println("Equals Method");
		return i == ((C) obj).i;
	}

	@Override
	public int hashCode() {
		System.out.println("Hashcode method");
		return (Integer.toString(i)).hashCode();
	}
}

public class Manager3 {
	
	public static void main(String[] args) {
		HashSet<C> hashSet=new HashSet();
		hashSet.add(new C(80));
		hashSet.add(new C(80));
		hashSet.add(new C(80));
		System.out.println(hashSet.size());
	}

}
