package com.evolvus.java.object.practies.equals;

class G {
	private int i;

	G(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "G[i]" + i;
	}

	@Override
	public boolean equals(Object obj) {
		return i == ((G) obj).i;
	}
}

class H {
	private int j;

	H(int j) {
		this.j = j;
	}

	@Override
	public String toString() {
		return "H[j]" + j;
	}

	@Override
	public boolean equals(Object obj) {
		return j == ((H) obj).j;
	}
}

public class Manager7 {
	public static void main(String[] args) {
		G g1=new G(20);
		G g2=new G(20);
		H h1=new H(20);
		H h2=new H(20);
		System.out.println(h1.equals(h2));
		System.out.println(g1.equals(g2));
		//System.out.println(g1.equals(h1)); classCastException
		System.out.println(h2.equals(h1));
		System.out.println(g2.equals(g1));
	}
}
