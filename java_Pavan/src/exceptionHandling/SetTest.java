package exceptionHandling;

// the class that represents user defined exception
class MyException extends Exception {

	public MyException(String m) {
		super(m);
	}
}

public class SetTest {
	
	public static void main(String args[]) {
	try {
		// throw an object of user defined exception
		throw new MyException("This is a custom Exception");
	}
	catch(MyException me) {
		System.out.println("Caught");
		System.out.println(me.getMessage());
	}
	}
}
