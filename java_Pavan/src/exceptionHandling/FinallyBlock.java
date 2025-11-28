package exceptionHandling;

public class FinallyBlock {

public static void main(String[] args) {
		
		String s=null;
		
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("exception handled...");
		}
		finally // finally block will execute whether exception occurs or not
		{
			System.out.println("entered into finally block......");
		}
		

	}
}
