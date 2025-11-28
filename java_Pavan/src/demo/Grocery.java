package demo;

// Inheritance
 class Grocery extends Product {
	public Grocery(int id,String name,int price) {
		super(id,name,price);
	}
	//override
	public double getDiscount() {
		return getprodprice()*0.05; // 5% discount
	}
}
