package exceptionHandling;
//Custom checked exception
class InvalidAgeException extends Exception{
	public InvalidAgeException(String m) {
		super(m);
	}
}

//using the custom Exception
public class CheckedCustomException {

	public static void validate(int age) throws InvalidAgeException  {
			if(age<18) {
				throw new InvalidAgeException("Age should be 18 and above");
			}
			System.out.println("Valid Age: "+age);
		}
	
	public static void main(String[] args) {
		try {
			validate(15);
		}
		catch(InvalidAgeException ex){
			System.out.println("Caught exception: "+ex.getMessage());
		}
	}
	}

//Explanation: The above example defines a custom checked exception InvalidAgeException that is thrown when an age is below 18. 
//The validate() method checks the age and throws the exception if the age is invalid. 
//In the main() method, the exception is caught and the error message is printed.