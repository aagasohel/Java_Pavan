package IntroProg;

public class DataTypeDemo {

	public static void main(String[] args) {
		
		// 1 Byte = 8 bit; 1 bit means 0 or 1
		// Numeric data types
				int a = 100, b = 200;
				System.out.println(a);
				System.out.println(b);
				System.out.println(a + b);

				byte by=120; 
				
				
				System.out.println(by);
				short sh = 250;
				System.out.println(sh);

				long l = 12356789768L; // Literal is needed at the end of the value.
				System.out.println(l);

				// Decimal number - float double

				float price = 150.5987545f; // Literal is needed at the end of the value
				System.out.println(price);

				double item_price = 145.3242342;
				System.out.println(item_price);

				// Character
				char grad = 'a'; // char datatype contains single alphabet,digit,special symbols
				System.out.println("The grad of the student is:" + grad);

				// boolean - allowed only true/ false -- default value false
				boolean bool = true;
				System.out.println(bool);

				// String
				String name = "John";

	}

}
