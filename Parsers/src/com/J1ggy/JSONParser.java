package com.J1ggy;
/* The Summer Garden Supply us their Menu updates as a JSON  file which they can export in a fixed format from their internal company software
 * Our job is to parse the JSON File and format it for output on our Delivery Web page. 
 * Other customers of ours may supply similar menu details in XML or CSV format and may display slightly different options - dependent on their business/menu items.
 * Think of us as a JustEat type of delivery service. We will call ourselves "Meals2Go"
 * We will need to implement an Adapter Pattern to interpret all these different formats that the restaurants supply their menus in. 
 * But first let's deal with the JSON  file supplied by The Summer Garden 
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;

public class JSONParser {  //CLASS TO PARSE JSON FILE SUPPLIED TO US BY THE SUMMER GARDEN
    String MenuItem, ItemName, Description, Price, Recommendations;
    ArrayList<SGItem> items = new ArrayList<>();   
     public void parse() {
        Gson gson = new Gson();//Create new instance of Gson Class
   	    String fileName = "/home/watso/eclipse_Workspace_JEEE/Parsers/src/com/J1ggy/SummerGardenMenuItems.json";//Give the path to the file
   	    try {
   	    	String content = new String(Files.readAllBytes(Paths.get(fileName)));//Read file at path into String
   	    	SGItem[] items = gson.fromJson(content, SGItem[].class);  //fromJson() converts Json content to Java objects
   	    	for(int i=0; i < items.length;i++) {
   	    		String item = items[i].MenuItem;
   	    		String name = items[i].ItemName;
   	    		String description =  items[i].Description;
   	    		String price =  items[i].Price;
   	    		String recommendations =  items[i].Recommendations;
   	    		SGItem menuItem = new SGItem(item, name, description, price, recommendations );
   	    		this.items.add(menuItem);
   	    	}
   	    	}catch(IOException e) {	e.printStackTrace();}
     }
     public ArrayList<SGItem> getMenu(){
   	  return items;
     }
}
 
     

