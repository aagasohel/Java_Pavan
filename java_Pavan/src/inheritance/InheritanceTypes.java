package inheritance;

class A 
{
	int a;
	void display()
	{
		System.out.println(a);
	}	
}

class B extends A  // here class B inherits the properties of class A. 
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B // class B contains properties of A & B and class C inherits class B so it have 3 classes properties
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}


public class InheritanceTypes {

	public static void main(String[] args) {
		B bobj=new B();  // object of subclass
		bobj.a=10;
		bobj.b=20;
		
		bobj.display(); //10
		bobj.show(); //20
		
	
	 C cobj=new C();
	
	 cobj.a=100;
	 cobj.b=200;
	 cobj.c=300;
	 
	 cobj.display(); //100
	 cobj.show();  //200
	 cobj.print();  //300
	}

}
