package encapsulation;

public class Account {

	private int accno; // in encapsulation each variable declared as private
	private String name; // can be accessed using public methods getters & setters
	private double amount;
	
	// for each variable there should be two methods(get & set)
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
