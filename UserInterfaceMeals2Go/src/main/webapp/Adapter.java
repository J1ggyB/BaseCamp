package main.webapp;

import java.util.ArrayList;

public class Adapter {
	ArrayList<Item>brusMenuItems;
	ArrayList<SGItem>sgMenuItems;
	ArrayList<CRItem>crMenuItems;
	
public ArrayList<Item>  loadMenu( int choice) {
	int result;
	switch(choice) {
	  case 1:
			XMLParser xparser = new XMLParser();
			brusMenuItems =  xparser.getMenu();
		    result =  1;
            break;
	  case 2:
			JSONParser jparser = new JSONParser();
			jparser.parse();
			sgMenuItems = jparser.getMenu();
			result = 2;
	    break;
	  case 3:
		  	CSVParser cparser = new CSVParser();
			crMenuItems = cparser.getMenu();
			result = 3;
		    break;
		    default:
		    	result = 1;
		    }
	switch(result) {
	case 1:
		return brusMenuItems;
	case 2:
		return new ArrayList<Item>(sgMenuItems);
	case 3:
	   return new ArrayList<Item>(crMenuItems);
	default:
		return brusMenuItems;
	}
	}
}