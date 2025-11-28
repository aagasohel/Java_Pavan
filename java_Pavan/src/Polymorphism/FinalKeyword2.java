package Polymorphism;

final class Test1 // final class cannot be inherited
{
	final void m1() // final method cannot override
	{
		System.out.println("this is m1 from Test1");
	}
}


//class Test2 extends Test1
//{
//	void m1()  /// incorrect. we cannot override final methods
//	{
//		System.out.println("this is m1 from Test2");
//	}
//}


public class FinalKeyword2 {

}
