package com.J1ggy;

public class ShoppingBasket {
private String productName;
private int quantity;
private double price;
protected static double takings; //Notice takings is protected so can be accessed within the package
                                 //takings is also static so that it can be updated from all baskets
public ShoppingBasket() {       
	super();
}

public ShoppingBasket(String productName, int quantity, double price) {
	super();
	this.productName = productName;
	this.quantity = quantity;
	this.price = price;
}
public void displayDetails() {
	double total = (price * quantity);
	this.takings += total;
	System.out.println("product Name: " + productName +"\n" +
			           "Quantity: " + quantity  +"\n" +
			           "Price: " +  price  +"\n" +
			           "Total: "+ total);
}

}
