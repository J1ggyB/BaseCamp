package com.J1ggy;

public class ShoppingBasket {
private String productName;
private int quantity;
private double price;

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
	System.out.println("product Name: " + productName +"\n" +
			           "Quantity: " + quantity  +"\n" +
			           "Price: " +  price  +"\n" +
			           "Total: "+ total);
}

}
