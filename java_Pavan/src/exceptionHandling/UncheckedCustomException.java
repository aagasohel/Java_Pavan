package exceptionHandling;

class DivideByZeroException extends RuntimeException{
	public DivideByZeroException(String m) {
		super(m);
	}
}

public class UncheckedCustomException {
	
	public static void divide(int a, int b) {
		if(b==0) {
			throw new DivideByZeroException("b value should not be zero because division by zero is not allowed");
		}
		System.out.println("Result: "+(a/b));
	}

	public static void main(String[] args) {
		try {
			divide(10,0);
		}
		catch(DivideByZeroException ex) {
			System.out.println("Caught exception: "+ex.getMessage());
		}

	}

}
//Explanation: The above example defines a custom unchecked exception DivideByZeroException that is thrown 
//when we are trying to divide by zero. The divide() method checks if the denominator is zero and throws the exception if true. 
//In the main() method, the exception is caught and the error message is printed.


