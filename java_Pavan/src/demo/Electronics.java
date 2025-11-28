package demo;

 // Inheritance
 class Electronics extends Product {
	public Electronics(int id,String name,int price) {
		super(id,name,price);
	}
	// override
	public double getDiscount() {
		return getprodprice()*0.10; // 10% discount
	}
}
