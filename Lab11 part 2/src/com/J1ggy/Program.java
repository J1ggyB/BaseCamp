package com.J1ggy;

import java.util.*;

public class Program {
    public static Queue<ShoppingBasket> baskets = new LinkedList<>();
    public static void buy(ShoppingBasket basket) {
    	baskets.add(basket);
    	};
    	public static void processBaskets() {
    		while(!baskets.isEmpty()) {
    			ShoppingBasket basket = baskets.element();
    			basket.displayDetails();
    			baskets.remove();
    			}
    	if(baskets.isEmpty()) {System.out.println("All Baskets have now been processed!");}
    	}
public static void main(String[] args) {
		ShoppingBasket basket1 = new ShoppingBasket("Teddy", 1, 9.99 );
		ShoppingBasket basket2 = new ShoppingBasket("Car", 3, 2.99);
		ShoppingBasket basket3 = new ShoppingBasket("Dolly", 1, 13.99);
		ShoppingBasket basket4 = new ShoppingBasket("Train", 1, 49.99);
		ShoppingBasket basket5 = new ShoppingBasket("Monkey", 2, 4.99);
		buy(basket1);
		buy(basket2);
		buy(basket3);
		buy(basket4);
		buy(basket5);
     processBaskets();
	}

}
