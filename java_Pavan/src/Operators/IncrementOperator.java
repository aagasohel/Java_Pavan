package Operators;

public class IncrementOperator {

	public static void main(String[] args) {
		int a=10;
		
		 //a=a+1;
		System.out.println(a++);//post increment
		
		System.out.println(a);
		
		// post increment
		int b=10;
		int res=b++;
		System.out.println(res); //10
		System.out.println(b);//11
	
		// pre increment
			int c=20;
			int res1=++c;
			System.out.println(res1);//11
			

	}

}
