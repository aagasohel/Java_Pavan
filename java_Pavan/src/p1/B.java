// Error while using class from different package with
// private access modifier
package p1;

 class A {

	private void display() {
		System.out.println("Welcome to java");
	}
}

public class B {

	public static void main(String[] args) {
		A obj = new A();
		
		// Trying to access private method of another class
		//obj.display(); //show error

	}

}
