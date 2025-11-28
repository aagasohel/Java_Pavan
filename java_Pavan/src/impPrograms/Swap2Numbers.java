package impPrograms;

public class Swap2Numbers {

	public static void main(String[] args) {
		
		int a=10,b=20;
		int t;
		System.out.println("Before swapping values are: "+a+" "+b);
		
		String s =new String("Welcome");
		
		//logic 1- swap using third variable
//		t=a;
//		a=b;
//		b=t;
		
		//logic 2- Swap using + & - without using third variable
//		a=a+b; //10+20=30
//		b=a-b; //30-20=10
//		a=a-b; //30-10=20
		
		//logic 3- Swapping using + & - without using third variable
//		a=a*b; //10*20=200
//		b=a/b; //200/20=10
//		a=a/b; //200/10=20
//		
		// logic 4 - bitwise XOR(^)
//		a=a^b;  // 10^20 =30
//		b=a^b;  // 30^20=10
//		a=a^b;  //30^10=20
		
		//logic 5- Single Statement
		//a=10, b=20
		b=a+b-(a=b);
		
		
		System.out.println("After swapping values are: "+a+" "+b);

	}

}
