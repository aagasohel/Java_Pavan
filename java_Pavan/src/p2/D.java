package p2;

import p1.C;

public class D extends C {

	public static void main(String[] args) {
		D obj = new D();
		obj.display(); // we can access protected method from class c in p1 package using inheritance

	}

}
