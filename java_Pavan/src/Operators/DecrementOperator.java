package Operators;

public class DecrementOperator {

	public static void main(String[] args) {
		int a=100;
		a=a-1;
		System.out.println(a); //99
		
		
		//post decrement
		
		int b=100;
		int res=b--;
		System.out.println(res); //100
		System.out.println(b); //99
		
		
		//pre-decrement
		int c=100;
		int res1= --c;
		System.out.println(res1); //99
		--res1;
		System.out.println(res1); //98

	}

}
