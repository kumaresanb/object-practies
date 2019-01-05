package com.evolvus.java.object.practies;

class G{
	private int k;
	G(int k){
		this.k=k;
	}
	@Override
	public String toString() {
		return Integer.toString(k);
	}
}
public class Manager12 {
	public static void main(String[] args) {
		G g1=new G(20);
		String s1="I:"+g1;
		System.out.println(s1);
	}

}
