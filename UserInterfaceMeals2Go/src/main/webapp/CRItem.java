package main.webapp;
//A simple Java Bean - To hold the details of Cafe Roma Menu items - Just a Constructor and Getters & Setters for each field
public class CRItem extends Item{
	protected String Restaurant = "The Cafe Roma";  // New field to identify ownership of menu items
	protected String id ;
	protected String name;
	protected String price ;
	protected String mealPrice ;
	protected String calories ;
	protected String mealCalories;
	protected String description ;
	protected String recommendations;       //Extra field for "The Summer Garden" menu
	protected String options;  
	protected String separator;

public CRItem(String item, String dish, String price, String description, String options) {
		super();
		this.id = item;
		this.name = dish;
		this.description = description;
		this.price = price;
		this.mealPrice = "";
		this.calories = "";
		this.mealCalories = "" ;
		this.recommendations = "";  
		this.options = options;
		this.separator = "<p>--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p>";
	}
@Override
public String toString() {
	String result = "\nid: " + id + "\nName: " + name + "\nPrice: "+ price + "\nDescription: " + description + "\nOptions: " + options + "\n" + "------------------------------\n";
	return result;
}
public String getRestaurant() {
	return Restaurant;
}
public void setRestaurant(String restaurant) {
	Restaurant = restaurant;
}
public String getItem() {
	return id;
}
public void setItem(String item) {
	this.id = item;
}
public String getDish() {
	return name;
}
public void setDish(String dish) {
	this.name = dish;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getMealPrice() {
	return mealPrice;
}
public void setMealPrice(String mealPrice) {
	this.mealPrice = mealPrice;
}
public String getCalories() {
	return calories;
}
public void setCalories(String calories) {
	this.calories = calories;
}
public String getMealCalories() {
	return mealCalories;
}
public void setMealCalories(String mealCalories) {
	this.mealCalories = mealCalories;
}

public String getRecommendations() {
	return recommendations;
}
public void setRecommendations(String recommendations) {
	this.recommendations = recommendations;
}
public String getOptions() {
	return options;
}
public void setOptions(String options) {
	this.options = options;
}
public String getSeparator() {
	return separator;
}
public void setSeparator(String separator) {
	this.separator = separator;
}

}
