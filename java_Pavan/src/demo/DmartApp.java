package demo;

import java.util.Scanner;

public class DmartApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Customer Entry
		System.out.println("===== Welcome to D-Mart Billing System ====="); 
		System.out.println("Dear customer, please enter name");
		String name =sc.next();
		System.out.println("Dear customer please enter your mobile number");
		String mono=sc.next();
		System.out.println("Dear customer please enter your Email Id");
		String email=sc.next();
	
		Customer c = new Customer(name,mono,email);

		//Products
	        Product[] p = { new Grocery(1, "Rice Bag", 800), 
	        		new Grocery(2, "Wheat Flour", 500), 
	        		new Electronics(3, "Mixer Grinder", 2500), 
	        		new Electronics(4, "LED Bulb", 200) }; 
	        
	        double totalBill = 0; 
	        boolean shopping = true; 
        
	    //While loop
        while (shopping) {
            // Display menu
            System.out.println("\n===== MENU =====");
            System.out.println("1. View Product");
            System.out.println("2. Buy Product");
            System.out.println("3. Checkout & Exit");
            System.out.print("Enter your choice (1-3): ");

            // Get user input
           int choice = sc.nextInt();
		
        //// -------- SWITCH CASE -------- 
		switch(choice) {
		case 1:
			System.out.println("\nAvailable Products:"); 
			// -------- FOR LOOP -------- 
			for (Product ep : p) { 
			System.out.println(ep.getprodid() + ". " + ep.getprodname() + " - ₹" + ep.getprodprice()); 
			} 
			break;
			
		case 2:
			System.out.print("Enter product id to buy: "); 
			int id = sc.nextInt(); 
			boolean found = false; 
			// CONDITION + LOOP 
			for (Product ep : p) { 
			if (ep.getprodid() == id) { 
			found = true; 
			double discount = ep.getDiscount(); 
			double finalPrice = ep.getprodprice() - discount; 
			totalBill += finalPrice; 
			System.out.println("You bought: " + ep.getprodname() + " | Price: ₹" + ep.getprodprice() + " | Discount: ₹" + discount + " | Final: ₹" + finalPrice); 
			} 
			} 
			if (!found) { 
			System.out.println("Invalid Product ID!"); 
			} 
			break; 
			
		case 3: 
			shopping = false; 
			c.displayCustInfo(); 
			System.out.println("Your Total Bill = ₹" + totalBill); 
			System.out.println("Thank you for shopping at D-Mart!"); 
			break; 
			
		default: 
			System.out.println("Invalid choice. Try again."); 
			} 
			} 
			sc.close();
			
		}
	}


