package Operators;

public class TernaryOperator {

	public static void main(String[] args) {
	//  var= exp ? result1 : result 2
		
			//Example1
			int a=100, b=200;
			int res=(a>b)?a:b;
			System.out.println(res);
		
			
			//Example2
			int person_age=15;
			
			String res1=(person_age>=18)? "Eligible": "Not eligible";
			
			System.out.println(res1);
			
			
			
			//Example3
			int x=(1==2)?100:200;
			
			System.out.println(x);
			
	}

}
