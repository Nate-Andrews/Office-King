// Nathan Andrews
// Homework 1
// 9/29/21
public class Product {
	// variables used for each product
	int productCode;
	String productName;
	String productDescription;
	double productCost;
	int productQuantity;
	boolean bought;
	
	// product class
	public Product(int productCode, String productName, String productDescription, double productCost, int productQuantity, boolean bought) {
		this.productCode = productCode;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productCost = productCost;
		this.productQuantity = productQuantity;
		this.bought = bought;
	}
	
	public static void main (String[] args) {
		// other variables needed
		String customerName = "Mike Smith";
		double salesTax = 0.06, tax;
		double pencilTotal, paperTotal, keyboardTotal;
		double subTotal, total, roundTotal;
		java.util.Date date = new java.util.Date();
		
		// assigned values to the products
		Product pencil = new Product(3711, "Pencil Bundle", "A pack of eight #2 pencils.", 3.49, 15, true);
		Product paper = new Product(4912, "Copy Paper Box", "A box with eight bundles of copy paper.", 29.99, 1, true);
		Product keyboard = new Product(7800, "Keyboard", "A wireless office keyboard.", 3.99, 1, true);
		
		// print out the catalog of the three products
		System.out.println("\t  " + " CATALOG ");
		System.out.println("______________________________________");
		System.out.println(pencil.productCode + "\r\n" + pencil.productName + "\r\n" + pencil.productDescription + "\r\n" + "$" + pencil.productCost);
		System.out.println("______________________________________");
		System.out.println(paper.productCode + "\r\n" + paper.productName + "\r\n" + paper.productDescription + "\r\n" + "$" + paper.productCost);
		System.out.println("______________________________________");
		System.out.println(keyboard.productCode + "\r\n" + keyboard.productName + "\r\n" + keyboard.productDescription + "\r\n" + "$" + keyboard.productCost);
		System.out.println("______________________________________");
		
		// These if statements check that there are no negative numbers
		// if quantity is 0 or less bought boolean will be made false
		// if cost is 0 or less the cost will be made $1
		if(pencil.productQuantity <= 0) {
			pencil.bought = false;
		}
		if(pencil.productCost <= 0.00) {
			pencil.productCost = 1.00;
		}
		
		if(paper.productQuantity <= 0) {
			paper.bought = false;
		}
		if(paper.productCost <= 0.00) {
			paper.productCost = 1.00;
		}
		
		if(keyboard.productQuantity <= 0) {
			keyboard.bought = false;
		}
		if(keyboard.productCost <= 0.00) {
			keyboard.productCost = 1.00;
		}
		
		// Calculates totals 
		pencilTotal = pencil.productCost * pencil.productQuantity;
		paperTotal = paper.productCost * paper.productQuantity;
		keyboardTotal = keyboard.productCost * keyboard.productQuantity;
		
		subTotal = pencilTotal + paperTotal + keyboardTotal;
		tax = subTotal * salesTax;
		total = subTotal + tax;
		
		// This takes the total and rounds it two decimal places. I Found this from https://intellipaat.com/community/35143/how-to-round-up-to-2-decimal-places-in-java
		roundTotal = Math.round(total * 100.0) / 100.0;
		
		// prints out the receipt
		// if bought is false then it wont print the statement
		System.out.println("\n\t" + " Receipt");
		System.out.println("______________________________________");
		
		System.out.println("\n\t" + "OFFICE KING");
		System.out.println("\nCustomer: " + customerName + "\r\n");
		if(pencil.bought == true)
			System.out.println(pencil.productName + "\t" + "x"+ pencil.productQuantity + "\t" + "$" + pencilTotal);
		if(paper.bought == true)
			System.out.println(paper.productName + "\t" + "x" + paper.productQuantity + "\t" + "$" + paperTotal);
		if(keyboard.bought == true)
			System.out.println(keyboard.productName + "\t" + "x" + keyboard.productQuantity + "\t" + "$" + keyboardTotal);
		
		System.out.println("\n\n\t Subtotal:\t$" + subTotal);
		System.out.println("\t Tax:\t\t$" + salesTax);
		System.out.println("\t Total:\t\t$" + roundTotal);
		System.out.println("______________________________________");
		
	}
	
}