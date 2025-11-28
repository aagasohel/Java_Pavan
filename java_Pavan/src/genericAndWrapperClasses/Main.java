package genericAndWrapperClasses;

public class Main {

	public static void main(String[] args) {
		
		//create instance of Integer type
		Test<Integer> iobj = new Test<Integer>(15);
		System.out.println(iobj.getObject());
		
		//create instance of String type
		Test<String> sobj = new Test<String>("Hi,Sohel");
		System.out.println(sobj.getObject());
		
		
		//create instance of multi parameters test1 class
		Test1<Integer,String> obj = new Test1<Integer,String>(1,"Sohel Aaga");
		
		obj.print();
		
		// Calling generic method with Integer argument
		TestGM objM = new TestGM();
		objM.genericDisplay(10);
		
		// calling generic method with string argument
		objM.genericDisplay("Welcome to our house");
		
		//calling generic method with double argument
		objM.genericDisplay(12.5);
		
//		WithoutGenerics wg =new WithoutGenerics();
//		wg.withoutGen();
	
		WithGenerics wgs =new WithGenerics();
		wgs.withGen();

	}

}
