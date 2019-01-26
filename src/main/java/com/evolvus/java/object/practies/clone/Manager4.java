package com.evolvus.java.object.practies.clone;
class D implements Cloneable{
	int i;
	D(int i){
		this.i=i;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Manager4 {
	public static void main(String[] args) {
		D d1=new D(40);
		try {
			D d2=(D)d1.clone();
			System.out.println(d2.i);
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}
}
