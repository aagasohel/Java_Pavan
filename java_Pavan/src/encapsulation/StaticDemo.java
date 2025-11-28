package encapsulation;

public class StaticDemo {

	static int a=10;   // static variable
	int b=20;    // non-static variable
	
	static void m1()     // static method
	{
		System.out.println("this is m1 static method...");
		
	}
	
	void m2()  // non-static
	{
		System.out.println("this is m2 non-static method...");
		 
	}
	
	
	void m()   // non-static
	{
		System.out.println(a); // we can call static things in non-static directly
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a); //static things in static method directly
		m1();
		
		//System.out.println(b); // we cannot access bcoz b is non-static
		//m2();  // we cannot access bcoz m2 is non-static
		
		// to call non-static thing in static method we need to create object of class
		
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		sd.m();
	
	}

}
