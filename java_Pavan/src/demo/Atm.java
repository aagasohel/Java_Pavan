package demo;

import java.util.Scanner;

class Bank
{
	public static String EmpName;
	public static  int AccBalance;

	public Bank()
	{
		System.out.println("Zero argument constructor");
	}
	public Bank(String EmpName ,int bal)
	{
		this.EmpName= EmpName;
		AccBalance= bal;	
	}

	int checkbal(){
		return AccBalance;
	}
}

public class Atm extends Bank {

	String atmname;
	
	public Atm(String EName ,int bal)
	{
		super(EName,bal);//call parent class constructor
	}

	public void deposit(int amt){
		AccBalance =AccBalance+amt;
	}

	public void Withdraw(int amt){
		AccBalance = AccBalance-amt;
	}

	public void displayDetails(int depamt, int witdrawamt){
	Scanner sc = new Scanner(System.in);
		System.out.println("Hi,Please enter the atm name");
		atmname=sc.next();

		deposit(depamt);

		Withdraw(witdrawamt);
		int currbal=checkbal();
		System.out.println("Current account balance of "+EmpName+" is "+currbal);
		
	}
	
	public static void main(String[] args) {
		Atm a = new Atm("Sohel",2500);
		a.displayDetails(600, 200);
		
	}

}
