package genericAndWrapperClasses;

public class PracticeMain {

	public static void main(String[] args) {
		 Integer myInt =10;
		 String myString = "Sohel";
		 Double myDouble =12.5;
		 Character myChar ='A';
		 System.out.println(myInt);//10
		 System.out.println(myDouble);//12.5
		 System.out.println(myChar);//A
		 System.out.println(myInt.intValue());//10
		String str =myInt.toString();
		System.out.println(str.length()); //2
	}

}
