package Polymorphism;

class Test
{
	final int x=100; // value of the final variable cannot be re-initialized
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		Test t=new Test();
		
		// t.x=200; // we cannot change the value of x. x is final variable
		System.out.println(t.x);
	}

}
