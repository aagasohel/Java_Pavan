package javaPackage_Wrapper_DataConversion;

public class DataConversions {

	public static void main(String[] args) {
		
		// Scenario 1:  String ---> int, double, bool, char (not possible)
		
		//String --> int
		//String s="welcome";  // cannot convert to number
		
		/*String s1="10";
		String s2="20";
				
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum);
		*/
		
		//String-->double
		
		/*String s1="10.5";
		String s2="5.15";
		
		double sum=Double.parseDouble(s1)+Double.parseDouble(s2);
		*/
		
		//String ---> boolean
		//String s="true";
		//boolean boolvalue=Boolean.parseBoolean(s);
		
		
		//String-->char    -- cannot covert - not possible
		
		
		//Scenario 2:  int, double, bool, char ----> String
	
		/*int x=100;
		String s=String.valueOf(x);
		
		double d=10.5;
		String s1=String.valueOf(d);
		
		boolean b=true;
		String s3=String.valueOf(b);
		
		char c='A';
		String s4=String.valueOf(c);
		*/
		
		//Scenario 3:
		
		// int ---double
		/*int x=10;
		double d=x;
		System.out.println(d);  //10.0
		*/
		
		//double ---int
		double d=10.5;
		int x=(int)d;
		System.out.println(x); //10
	}
}
