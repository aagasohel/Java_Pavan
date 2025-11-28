package ConditionalStatements;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int person_age=sc.nextInt();
		
		if(person_age>=18)
		{
			System.out.println("Eligible for vote");
		}
		

	}

}
