package inheritance;

class Parent // one parent and multiple child
	{
		void display(int a)
		{
			System.out.println(a);
		}
	}

class Child1 extends Parent
	{
		void show(int b)
		{
			System.out.println(b);
		}
	}

class Child2 extends Parent
	{
		void print(int c)
		{
			System.out.println(c);
		}
	}

public class HierarchyInheritance {
	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.display(100); //100 parent method
		c1.show(200); //200 child method
		
		Child2 c2=new Child2();
		c2.display(10); //10 parent method
		c2.print(20); //20 child method

	}

}
