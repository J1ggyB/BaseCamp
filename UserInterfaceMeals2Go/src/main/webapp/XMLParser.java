package main.webapp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* Burgers_R_US Supply us their Menu updates as an XML file which they can export in a fixed format from their internal company software
 * Our job is to parse the XML File and format it for output on our Delivery Web page.
 * Other customers of ours may supply similar menu details in JSON or CSV format and may display slightly different options - dependent on their business/menu items.
 * Think of us as a JustEat type of delivery service. We will call ourselves "Meals2Go"
 * We will need to implement an Adapter Pattern to interpret all these different formats that the restaurants supply their menus in.
 * But first let's deal with the XML file supplied by Burgers_R_US
 */

//CREATE A CLASS TO PARSE THE BURGERS_R_US SUPPLIED XML FILE
public class XMLParser {

  private static final String Burgers_R_US_FILENAME = "/home/watso/eclipse_Workspace_JEEE/Parsers/src/com/J1ggy/Menu.xml";   //THIS LINE JUST SETS THE XML FILENAME TO A VARIABLE
  ArrayList<Item> items = new ArrayList<>();                                 //Creates an ArrayList to hold each  menu item
      // Instantiate the Factory
      //DocumentBuilderFactory - Defines a factory API that enables applications to obtain a parser that produces DOM object trees from XML documents.
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();{  //Defines a factory API that enables applications to obtain a parser that produces DOM object trees from XML documents.
    /*   ".newInstance()" -  Obtains a new instance of a DocumentBuilderFactory. This method uses the JAXP Lookup Mechanism to determine the DocumentBuilderFactory implementation class to load.
    	  Once an application has obtained a reference to a DocumentBuilderFactory, it can use the factory to configure and obtain parser instances. */

      try {     //Embed in Try Catch block as we may fail to read the XML file in

          // optional, but recommended
          // process XML securely, avoid attacks like XML External Entities (XXE)
        factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
          /*
                IMPORTANT! - An XML eXternal Entity injection (XXE), which is now part of the OWASP Top 10 via the point A4,
                is attack against applications that parse XML input. This issue is referenced in the ID 611 in the Common Weakness Enumeration referential.
                 An XXE attack occurs when untrusted XML input with a reference to an external entity is processed by a weakly configured XML parser,
                 and this attack could be used to stage multiple incidents, including:
                 							1 - A denial of service attack on the system
											2 - A Server Side Request Forgery (SSRF) attack
											3 - The ability to scan ports from the machine where the parser is located
											4 - Other system impacts.
*/


        // parse XML file
       // The Javax.xml.parsers.DocumentBuilderFactory.newDocumentBuilder() method creates a new instance of a DocumentBuilder using the currently configured parameters.
          DocumentBuilder builder = factory.newDocumentBuilder();

          Document doc = builder.parse(new File(Burgers_R_US_FILENAME));  // It is the The DocumentBuilder that gives us the parse() method to read in the file.

          // optional, but recommended
          doc.getDocumentElement().normalize();   // Simply formats the XML (under the bonnet) for simpler parsing - Thik of it as a quick tidy of the file layout

          //System.out.println("Root Element :" + doc.getDocumentElement().getNodeName()); //Picks u the first Node element <Burgers_R_Us><\Burgers_R_Us> Then simple SYSO
         // System.out.println("--------------------------------------------------"); //Just a SYSO

          // get <staff>
          NodeList list = doc.getElementsByTagName("menuItem");  // creates a node list by searching  "doc" (The normalised data) for the element "menuItem" by it's tag name <menuItem></menuItem>

          for (int i = 0; i< list.getLength(); i++) { //Iterate the newly created  node list

              Node node = list.item(i);  //Assign each item one at a time to a Node variable

              if (node.getNodeType() == Node.ELEMENT_NODE) {  //If a valid Node

                  Element element = (Element) node; //An element node encapsulates an XML element. An element can have zero or one parent - We need to cast the node back to an Element

                  // get menuItem's attribute
                  String id = element.getAttribute("id");   //We can then extract the attribute values

                  // get text
                  String name = "<h4>Dish: " + element.getElementsByTagName("name").item(0).getTextContent() + "</h4>";  //For a menu item we will assign each elements content to appropriate strings - name, price...etc
                  String description = "<h5>Dish: "  + element.getElementsByTagName("description").item(0).getTextContent() + "</h5>"; 
                  String price = "<h4>Price: " + element.getElementsByTagName("price").item(0).getTextContent() +"</h4>";
                  String mealPrice = "<h5>Meal Price: " + element.getElementsByTagName("mealPrice").item(0).getTextContent() + "</h5>";
                  String calories = "<h6>Calories: " + element.getElementsByTagName("calories").item(0).getTextContent() + "</h6>";
                  String mealCalories = "<h6>Meal Calories: " + element.getElementsByTagName("mealCalories").item(0).getTextContent() + "</h6>";
                // String recommendations = "";
                 // String options = "";
                // String Separator = "<p>--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p>";


                  BRUSItem  item = new BRUSItem (id, name, price, mealPrice,calories,mealCalories,description);   //Create individual objects of class BRUSItem for each menu item
                  setItems(item);   // Add each Menu Item (instances of the Class BRUSItem to our ArrayList  "items" - Declared at top -  We can later use getMenu() from the Program to collect the list of Menu items.

   /* 		 If we had just wanted Console output -  We could have just printed out each element
                 System.out.println("Current Element : " + node.getNodeName());
                  System.out.println("Menu item Id : " + id);
                  System.out.println("Product Name : " + name);
                  System.out.println("Price : " + price);
                  System.out.println("Price as a meal : " + mealPrice);
                  System.out.println("Calories: " + calories);
                  System.out.println("Full meal approx: " + mealCalories);
                  System.out.println("Description: " + description);
             */

              }
          }

      } catch (ParserConfigurationException | SAXException | IOException e) {  //Catch if reading file fails
          e.printStackTrace();  // Print out the error
      }
}


	// Method used earlier to add each item to the ArrayList "items"
      public void setItems(Item item)    {
    	    items.add(item);
    	}
      //Method to return  a Burgers_R_Us Menu "Items" as an ArrayList
      public ArrayList<Item> getMenu(){
    	  return items;
      }
}

