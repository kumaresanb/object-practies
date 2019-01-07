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

	}
}
