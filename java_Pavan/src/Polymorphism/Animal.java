package Polymorphism;

public class Animal {

	String color="white";
	
	void eat() // non static method
	{
		System.out.println("eating....");
	}
	
	Animal() // Zero argument constructor
	{
		System.out.println("This is Animal..");
	}
	
	Animal(String name) // Parameterized constructor
	{
		System.out.println(name);
	}
}

class Dog extends Animal
{
		
	String color="black";
	
	void displayColor() // non static method
	{
		System.out.println(super.color); 
	}
	
	void eat() // non static method
	{
		//System.out.println("eating bread");
		super.eat(); // when we call eat method of Dog class it will call the eat 
		//method of Animal class with the help of Super keyword
	}
	
	Dog() // Zero argument constructor
	{
		super(); // invoke parent class constructor
		//System.out.println("this is Dog..");
	}
	
	Dog(String name) // Parameterized constructor
	{
		super(name);
	}
	

}
