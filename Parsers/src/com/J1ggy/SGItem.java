package com.J1ggy;
//A simple Java Bean - To hold the details of a Summer Garden Menu item - Just a Constructor and Getters & Setters for each field
public class SGItem{   // CLASS FOR  SUMMER GARDEN MENU ITEMS
String MenuItem, ItemName, Description,Price, Recommendations;

public SGItem(String menuItem, String itemName, String description, String price, String recommendations) {
	super();
	MenuItem = menuItem;
	ItemName = itemName;
	Description = description;
	Price = price;
	Recommendations = recommendations;
}
public String toString() {
	String result = "\nid: " + MenuItem + "\nName: " + ItemName+ "\nDescription: "+ Description + "\nPrice: " + Price+ "\nRecommendations: " + Recommendations+ "\n" + "------------------------------\n";
	return result;
}
public String getMenuItem() {
	return MenuItem;
}

public void setMenuItem(String menuItem) {
	MenuItem = menuItem;
}

public String getItemName() {
	return ItemName;
}

public void setItemName(String itemName) {
	ItemName = itemName;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

public String getPrice() {
	return Price;
}

public void setPrice(String price) {
	Price = price;
}

public String getRecommendations() {
	return Recommendations;
}

public void setRecommendations(String recommendations) {
	Recommendations = recommendations;
}
}
