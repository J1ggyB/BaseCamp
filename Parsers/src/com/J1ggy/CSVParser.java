package com.J1ggy;
/* The Cafe Roma Supply us their Menu updates as a CSV file which they can export in a fixed format from their internal company software
 * Our job is to parse the CSV File and format it for output on our Delivery Web page. 
 * Other customers of ours may supply similar menu details in JSON or XML format and may display slightly different options - dependent on their business/menu items.
 * Think of us as a JustEat type of delivery service. We will call ourselves "Meals2Go"
 * We will need to implement an Adapter Pattern to interpret all these different formats that the restaurants supply their menus in. 
 * But first let's deal with the CSV file supplied by The Cafe Roma.
 */
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class CSVParser {      //CLASS TO PARSE A CSV FILE SUPPLIED TO US BY CAFE ROMA
	  ArrayList<CRItem> items = new ArrayList<>();     
    public void parseCSV() {
    	try(CSVReader reader 
    	        = new CSVReader(new FileReader("/home/watso/eclipse_Workspace_JEEE/Parsers/src/com/J1ggy/CafeRomaMenu.csv")))
    	{
    	  String [] nextLine;

    	  //Read one line at a time
    	  while ((nextLine = reader.readNext()) != null)
    	  {
    	    String  line  = Arrays.toString(nextLine);
    	     String  [] fields = line.split(",");
    	     CRItem menuItem = new CRItem(fields[0], fields[1],fields[2],fields[3], fields[4]);
    	     setItems(menuItem);
    	   // System.out.println(Arrays.toString(nextLine));
    	  }
    	}
    	catch (IOException | CsvValidationException e) {
    	  e.printStackTrace();
    	}
}
    // Method used earlier to add each item to the ArrayList "items"
    public void setItems(CRItem  item)    {
  	    items.add(item);
  	}
    //Method to return  Cafe Roma  Menu "Items" as an ArrayList
    public ArrayList<CRItem> getMenu(){
  	  return items;
}
}  
    
