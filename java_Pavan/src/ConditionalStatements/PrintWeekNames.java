package ConditionalStatements;

import java.util.Scanner;

public class PrintWeekNames {
// If Else if Ladder
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weekDay number");
		int weekDayno=sc.nextInt();
		
		if(weekDayno==1)
		{
			System.out.println("Sunday");
		}
		else if(weekDayno==2)
		{
			System.out.println("Monday");
		}
		else if(weekDayno==3)
		{
			System.out.println("Tuesday");
		}
		else if(weekDayno==4)
		{
			System.out.println("Wednesday");
		}
		else if(weekDayno==5)
		{
			System.out.println("Thursday");
		}
		else if(weekDayno==6)
		{
			System.out.println("Friday");
		}
		else if(weekDayno==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid week number");
		}
		

	}

}
