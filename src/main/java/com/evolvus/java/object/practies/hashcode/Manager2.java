package com.evolvus.java.object.practies.hashcode;

class B {
	int i, j;
	double k;
	boolean b1;

	B(int i, int j, double k, boolean b1) {
		this.i = i;
		this.j = j;
		this.k = k;
		this.b1 = b1;
	}
	
	@Override
	public String toString() {
		return "I:"+i+" J:"+j+" K:"+k+" B1:"+b1;
	}

	@Override
	public int hashCode() {
		return (Integer.toString(i)).hashCode() + (Integer.toString(j)).hashCode() + (Double.toString(k)).hashCode()
				+ Boolean.toString(b1).hashCode();
	}
	 @Override
	public boolean equals(Object obj) {
		if(!(obj instanceof B)) {
			return false;
		}
		return i==((B)obj).i&&j==((B)obj).j&&k==((B)obj).k&&b1==((B)obj).b1;
	}
}

public class Manager2 {
	public static void main(String[] args) {
		B b1=new B(10,30,23.34,true);
		B b2=new B(10,30,23.34,true);
		System.out.println(b1);
		System.out.println(b2);		
		System.out.println(b1==b2);/** equal (==) operator only used of primitive data tupe not derived data type*/
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}
}
