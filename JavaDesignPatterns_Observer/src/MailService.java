import java.util.ArrayList;
import java.util.List;

public class MailService {						// Define the class
	//Fields----------------------------------------------------------------------------------------
	List<EmailNotificationListener>emlsubscribers ;				// A List to hold the EmailNotificationListeners  --- Who wants an email when stock arrives
	List<SMSNotificationListener>smssubscribers ;					// A List to hold the SMSNotificationListeners  --- Who wants an sms when stock arrives
																																// Note it is the Listeners containing the customer request not the customer that is kept in these lists
	
	//Constructor--------------------------------------------------------------------------------
	MailService() {
    	emlsubscribers = new ArrayList<>();                                     // Creates and assigns two ArrayLists for email and sms subscriptions respectfully
    	smssubscribers = new ArrayList<>();
    }
    
    public void emlsubscribe( EmailNotificationListener listener) {         // Add an email subscriber
    	emlsubscribers.add(listener);
    }
    public void emlunSubscribe( EmailNotificationListener listener) {    // remove an email subscriber
    	emlsubscribers.remove(listener);
    }
    public void smssubscribe( SMSNotificationListener listener) {    // Add an SMS subscriber
    	smssubscribers.add(listener);
    }
    public void smsunSubscribe( SMSNotificationListener listener) {   // remove an SMS subscriber
    	smssubscribers.remove(listener);
    }
    public void notifyCustomers(Part part) {     //  Iterates through each subscriber list and calls the update() method of the Listener (both email & sms lists) - passes in the out of stock part

    	for(EmailNotificationListener eml : emlsubscribers)  { if(eml.getCust().isEmlSubscriber()) {eml.update(part);}}   
    	for(SMSNotificationListener sms : smssubscribers)  { if(sms.getCust().isSmsSubscriber()) {sms.update(part);}}

    }
}
