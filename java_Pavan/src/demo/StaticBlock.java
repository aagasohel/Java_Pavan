package demo;

public class StaticBlock {

	public StaticBlock() {
		System.out.println("This is constructor of parent class");
	}
	
	static {
	System.out.println("This is a static block");
	}
}
