package com.evolvus.java.object.practies.equals;

class Book {
	private double weight;

	public Book(double weight) {
		this.weight = weight;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book)) {
			return false;
		}

		return weight == ((Book) obj).weight;
	}
}

class Fan {
	private double weight;

	public Fan(double weight) {
		this.weight = weight;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Fan)) {
			return false;
		}
		return weight == ((Fan) obj).weight;
	}

}

public class Manager9 {
	public static void main(String[] args) {
		Book b1=new Book(123.34);
		Book b2=new Book(123.34);
		Fan  f1= new Fan(200.21);
		Fan  f2= new Fan(200.21);
		System.out.println(b1.equals(b2));
		System.out.println(f1.equals(f2));
		System.out.println(b1.equals(f1));
		System.out.println(b2.equals(f2));
		System.out.println(b2.equals(b1));
		System.out.println(f2.equals(f1));
	}
}
