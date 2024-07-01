package main.webapp;

public class Item {
	
//Fields-------------------------------------------------------------------------------------------------------------
	protected String Restaurant;  // New field to identify ownership of menu items
	protected String id ;
	protected String name;
	protected String price ;
	protected String mealPrice;
	protected String calories ;
	protected String mealCalories ;
	protected String description ;
	protected String recommendations;       //Extra field for "The Summer Garden" menu
	protected String options;                              //Extra field for "The Cafe Roma" menu
	protected String separator;
	//-----------------------------------------------------------------------------------------------------------------------
	//Constructor - defers the initialisation of fields to setters 
	public Item() {
		super();
	}
public Item(String item, String name, String description, String price, String mealPrice, String calories, String mealCalories, String recommendations , String options) {
		this.id = item;
		this.name = name;
		this.description = description;
		this.price = price;
		this.mealPrice =mealPrice;
		this.calories = calories;
		this.mealPrice = mealCalories;
		this.recommendations= recommendations;
		this.options = options;
		this.separator = "<p>--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p>";
}
	//Getters & Setters for each field ------------------------------------------------------------------
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		this.separator=separator;
	}
}
/*
 -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 COMPARING THE OTHER TO MENUS TO "BurgersRUs"  WE HAVE TWO EXTRA FIELDS REQUIRED 
 -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 The Summer Garden :
 MenuItem = menuItem;    ----Exists
ItemName = itemName;   ----Exists
Description = description; ----Exists
Price = price;   ----Exists
Recommendations = recommendations; ----New 
------------------------------------------------------------------------------
The Cafe Roma:
String item;       -----Exists
String dish;        -----Exists
 String price;     ------Exists
 String description;   -----Exists
 String options;       ------New
 */