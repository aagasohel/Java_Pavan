package encapsulation;

public class ThisKeyword {

	int x, y;   // class variables/ instance variables

	void setData(int a, int b)    // a,b are the local variables
	{
		x=a;
		y=b;
	}
	
//	ThisKeyword(int x, int y)
//	{
//		this.x=x;
//		this.y=y;
//		
//	}
	
	void display()
	{
		System.out.println(x+"   "+y);
	}
	
	public static void main(String[] args) 
	{
		//ThisKeyword th=new ThisKeyword(12,15);
		
		ThisKeyword th=new ThisKeyword();
		th.setData(10,20);
		
		th.display();
		
	}
}
