package com.J1ggy;

import java.util.*;

public class Program {
    public static Queue<ShoppingBasket> baskets = new LinkedList<>(); // LinkedList used as a queue
    public static void buy(ShoppingBasket basket) {
    	baskets.add(basket);
    	};
    	public static void processBaskets() {//While there is baskets
    		while(!baskets.isEmpty()) {
    			ShoppingBasket basket = baskets.element();//retrieve the next basket
    			basket.displayDetails();//display its details
    			baskets.remove();//remove it from the List
    			}
    	if(baskets.isEmpty()) {System.out.println("All Baskets have now been processed!\n "
    			+ "The takings are: " + ShoppingBasket.takings);} //Once baskets empty print static (class) variable takings
    	}
public static void main(String[] args) {
		ShoppingBasket basket1 = new ShoppingBasket("Teddy", 1, 9.99 );//Create five baskets
		ShoppingBasket basket2 = new ShoppingBasket("Car", 3, 2.99);
		ShoppingBasket basket3 = new ShoppingBasket("Dolly", 1, 13.99);
		ShoppingBasket basket4 = new ShoppingBasket("Train", 1, 49.99);
		ShoppingBasket basket5 = new ShoppingBasket("Monkey", 2, 4.99);
		buy(basket1); //adds the baskets to the queue
		buy(basket2);
		buy(basket3);
		buy(basket4);
		buy(basket5);
     processBaskets(); //processes the queue
	}

}
