package com.J1ggy;
//A simple Java Bean - To hold the details of Cafe Roma Menu items - Just a Constructor and Getters & Setters for each field
public class CRItem {
	String item, dish,  price, description, options;
public CRItem(String item, String dish, String price, String description, String options) {
		super();
		this.item = item;
		this.dish = dish;
		this.price = price;
		this.description = description;
		this.options = options;
	}
public String toString() {
	String result = "\nid: " + item + "\nName: " + dish + "\nPrice: "+ price + "\nDescription: " + description + "\nOptions: " + options + "\n" + "------------------------------\n";
	return result;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public String getDish() {
	return dish;
}
public void setDish(String dish) {
	this.dish = dish;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getOptions() {
	return options;
}
public void setOptions(String options) {
	this.options = options;
}


}
