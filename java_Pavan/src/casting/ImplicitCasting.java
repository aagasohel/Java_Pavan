package casting;

import java.time.Duration;

public class ImplicitCasting {

	static void impCas() throws InterruptedException {
		byte b = 107;
		System.out.println(b);
		short s =b;  //smaller datatype to larger
		System.out.println(s);
		int i =s;
		System.out.println(i);
		long l=i;
		System.out.println(l);
		
		float f =l;
		System.out.println(f);
		double d = f;
		System.out.println(d);
		
		long l1 = 10000;
		int i2=(int)l1;
		System.out.println(i2);
		
		int i3 =35000;
		System.out.println(i3);
		short sh = (short)i3;
		Thread.sleep(Duration.ofSeconds(2));
		System.out.println(sh);
	}
}
