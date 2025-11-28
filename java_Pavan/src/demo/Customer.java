package demo;
//Encapsulation
public class Customer {

	private String custName;
	private String custMoNo;
	private String custEmail;
	
	public Customer(String name,String MoNo,String Email) {
		custName=name;
		custMoNo=MoNo;
		custEmail=Email;
	}
	
	public String getcustName() {
		return custName;
	}
	public String getcustMoNo() {
		return custMoNo;
	}
	public String getcustEmail() {
		return custEmail;
	}
	
	public void displayCustInfo() {
		System.out.println("\n===== Customer Details ====="); 
		System.out.println("Customer name is: "+custName);
		System.out.println("Customer Mobile number is: "+custMoNo);
		System.out.println("Customer Email Id is: "+custEmail);
		System.out.println("===============================");
	}
}
