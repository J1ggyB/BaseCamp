package main.webapp;
//A simple Java Bean - To hold the details of a Summer Garden Menu item - Just a Constructor and Getters & Setters for each field
public class SGItem extends Item{   // CLASS FOR  SUMMER GARDEN MENU ITEMS

	protected  String id ;
	protected  String name;
	protected  String price ;
	protected  String mealPrice;
	protected String calories;
	protected  String mealCalories ;
	protected  String description ;
	protected  String recommendations;       //Extra field for "The Summer Garden" menu
	protected String options;  
	protected String separator;

	public SGItem() {
		super();
	}
	public SGItem(String menuItem, String itemName, String price, String description, String recommendations) {
		super();
		this.id = menuItem;
		this.name = itemName;
		this.price = price;
		this.mealPrice = "";
		this.calories = "" ;
		this.mealCalories="" ;
		this.description = description;
		this.recommendations = recommendations;
		this.options ="";   
		this.separator = "<p>--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p>";
	}

	public String toString() {
		String result = "\nid: " + id + "\nName: " + name+ "\nDescription: "+ description + "\nPrice: " + price+ "\nRecommendations: " + recommendations+ "\n" + "------------------------------\n";
		return result;
	}
	public String getMenuItem() {
		return id;
	}
	public void setMenuItem(String menuItem) {
		this.id = menuItem;
	}
	public String getItemName() {
		return name;
	}
	public void setItemName(String itemName) {
		this.name = itemName;
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
