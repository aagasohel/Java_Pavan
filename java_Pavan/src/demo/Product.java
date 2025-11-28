package demo;

// Abstraction
abstract class Product {
	private int prodid;
	private String prodname;
	private int prodprice;
	
	//Encapsulation
	public Product(int id,String name,int price) {
		prodid=id;
		prodname=name;
		prodprice=price;
	}
	
	public int getprodid() {
		return prodid;
	}
	public String getprodname() {
		return prodname;
	}
	public int getprodprice() {
		return prodprice;
	}
	
	//Polymorphism
   public abstract double getDiscount();
}
