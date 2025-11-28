package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {

public static void main(String[] args) throws IOException  {
		
		System.out.println("Program is started..");
		System.out.println("Program in progress..");
		
		try 
		{
			FileInputStream file=new FileInputStream("C:\\Users\\shoel\\OneDrive\\Documents\\file.txt");
			System.out.println(file.read());
		}
		catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
//		FileInputStream file=new FileInputStream("C:\\Users\\shoel\\OneDrive\\file.txt");
//		
//		System.out.println(file.read());
		

		System.out.println("Program is completed..");
		
		
	}

}
