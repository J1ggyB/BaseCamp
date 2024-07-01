import java.util.ArrayList;
import java.util.List;

public  class Store {																								//Define the class Store
// Fields--------------------------------------------------------------------------------------------------------------------------------------
MailService subscribers;                                                                                   //Will hold an instance of MailService containing a list to hold subscribers and notify them of relevant stock changes
ArrayList<Customer>customers = new ArrayList<>();                    //A complete list of customers - Not just subscribers
ArrayList<Part> stockItems = new ArrayList<>();								//A complete list of stock items - including items where stock is zero

// Constructor----------------------------------------------------------------------------------------------------------------------------
public Store() {
	subscribers = new MailService();                                                              // Creates a new instance of MailService and assigns it to the field subscribers
}

public void contactCustomers(Part part) {                                              // Method takes a part (The one that was out of stock)  
	subscribers.notifyCustomers(part);															// Tells the MailService to notify customers of replenishment
}

public MailService getService() {                                                                    //Just a Getter method - ignore
	return subscribers;
}

public void createInterestedListeners(Part partIn) {							// Here we filter for subscribers  interested in the "out of stock" part 
	for(Customer cust : customers) {																// Iterate through all of our customers
			if(cust.getInterest()== partIn) {															// If they are interested in the part
				if(cust.isEmlSubscriber()) {																	// If they are an email subscriber
					EmailNotificationListener el = new EmailNotificationListener(cust.getEmail(),cust);       //Create an instance of "EmailNotificationListener(String email, Customer  cust)
					subscribers.emlsubscribers.add(el);																												//Add the new listener to the emailsubscribers list of the subscribers MailService
				}
				if( cust.isSmsSubscriber() == true) {																														// If they are an SMS subscriber
					SMSNotificationListener sl = new SMSNotificationListener(cust.getMobile(), cust);         // Create an instance of "SMSNotificationListener(String mobile, Customer  cust)
					subscribers.smssubscribers.add(sl);																												// //Add the new listener to the smssubscribers list of the subscribers MailService
				}
			}
	}
}
public void addStock(Part partIn , int qty) {   // add a quantity of a particular stock item
	for(Part prt : stockItems) { //Search through parts in stock
		if(prt.getPartNo() == partIn.getPartNo()) {//if the part number matches one in stock
			int currentQty = prt.getInStockQty();  //record current stock level
			prt.setInStockQty(prt.getInStockQty() + qty); //update the new stock level
				if (currentQty== 0 ) {  //if the existing stock level was 0
						contactCustomers(partIn);    // TRIGGER THE NOTIFICATIONS!
				}
			
			}
		}
	}

}
