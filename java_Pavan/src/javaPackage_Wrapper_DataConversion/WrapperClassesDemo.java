package javaPackage_Wrapper_DataConversion;

public class WrapperClassesDemo {

public static void main(String[] args) {
		
		//Primitive
		int i=10;  
		double d=10.5; 
		char c='A';
		boolean b=true;
		
		//converting primitives to object type - Auto boxing
		
		Integer iobj=i;   // Object
		Double dobj=d;
		Character cobj=c;
		Boolean bobj=b;
		
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		//converting objects to primitive type - Un boxing
		
		int intvalue= iobj;
		double doublevalue=dobj;
		char charvalue=cobj;
		boolean boolvalue=bobj;
		
		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(charvalue);
		System.out.println(boolvalue);
		
	 	
	}

}
