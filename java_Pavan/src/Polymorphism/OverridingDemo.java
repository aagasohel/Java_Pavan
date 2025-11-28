package Polymorphism;

class Bank // Parent class
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank // for method overriding there should be at least two classes and inheritance is must
{
	 double roi() // Parent and child class have method with same name and same argument but after inheritance method body will be changed
	{
		return 10.5;
		//return super.roi();
	}
}

class SBI extends Bank // child class
{
	double roi()
	{
		return 11.5;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		ICICI ic=new ICICI();
		System.out.println(ic.roi());  //10.5
		
		SBI sb=new SBI();
		System.out.println(sb.roi());  //11.5

	}

}
