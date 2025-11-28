package ConditionalStatements;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num%2==0)  //2 se divide krne ke baad agar remainder 0 ata hai to even otherwise odd
		{
			System.out.println("Given number "+num+" is even number");
		}
		else
		{
			System.out.println("Given number "+num+" is odd number");
		}
		

	}

}
