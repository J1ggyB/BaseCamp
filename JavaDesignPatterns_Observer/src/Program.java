/* JAVA DESIGN PATTERNS -  THE OBSERVER PATTERN (A Responsibility Pattern)
The reasoning behind the Observer Pattern is the creation of a "One to Many Dependancy" between objects where if an Object changes state the dependants of that
Object will be of the state change and can perform some actions based on that change.
In our example I have a hardware store where replenishment of "empty or 0" stock triggers a notification - The dependants can then email or SMS the customer with an update.   */
public class Program {

	public static void main(String[] args) {
//Create a Store instance	--------------------------------------------------------------------------	
Store JoesHardware = new Store();     // A simple Hardware Store that takes subscriptions so that if an item is out of stock we can email or sms the customer when stock arrives in

//Add some stock items (not necessarily in stock - see hammer)----------
Part screwdriver = new Part(1111,"Screwdriver", 30, 3.99);
JoesHardware .stockItems.add(screwdriver);
Part spanner = new Part(1112,"Spanner", 20, 4.99);
JoesHardware .stockItems.add(spanner);
Part hammer = new Part(1113,"Claw Hammer", 0, 6.99);  // Item out of Stock!!!
JoesHardware .stockItems.add(hammer);

//Create some Customers-------------------------------------------------------------------------
Customer cust1 = new Customer("John", "Johnston", "john77johnston@gmail.com", "078260260");
Customer cust2= new Customer("Graeme", "Watson", "graeme977watson@yahoo.com", "078260261");
Customer cust3 = new Customer("Robin", "Menzies", "robm897@pccsystems.co.uk", "078260262");
Customer cust4 = new Customer("Duncan", "Dalgleish", "duncan.dalgleish@avcdirect.co.uk", "078260263");

// Set subscriptions-----------------------------------------------------------------------------------Remember we have stock on some items!
cust1.setEmlSubscriber(true);   // John is an E-Mail Subscriber
cust2.setEmlSubscriber(false);  // Graeme is not an E-Mail Subscriber
cust3.setEmlSubscriber(true);   // Robin is an E-Mail Subscriber
cust4.setEmlSubscriber(false);  // Duncan is not an E-Mail Subscriber
cust1.setSmsSubscriber(false); // John is not an SMS Subscriber
cust2.setSmsSubscriber(false);  // Graeme is not an SMS Subscriber either
cust3.setSmsSubscriber(true);   // Robin is an SMS Subscriber
cust4.setSmsSubscriber(true);   // Duncan is an SMS Subscriber

//Who needs a hammer----------------------------------------------------------------------------
cust1.setInterest(hammer); // John needs a hammer
cust2.setInterest(spanner); // Graeme needs a spanner (in store)
cust3.setInterest(screwdriver); // Rob needs a screwdriver (in store)
cust4.setInterest(hammer); // Duncan needs a hammer

//Add each Customer to customers list--------------------------------------------------
JoesHardware.customers.add(cust1);   //Adds each customer to the customers ArrayList of the Store
JoesHardware.customers.add(cust2);
JoesHardware.customers.add(cust3);
JoesHardware.customers.add(cust4);

//How many hammers do we have------------------------------------------------------------//Unnecessary - Just confirm they are there zero hammers before we start
int item = JoesHardware.stockItems.indexOf(hammer);  //Unnecessary - get the index of "hammer"
System.out.println("We have " + JoesHardware.stockItems.get(item).getInStockQty()+ " hammers in Stock\n");  //Unnecessary - get and print out the quantity
//Load up the Listeners into the MailService ArrayLists for email and sms subscribers
JoesHardware.createInterestedListeners(hammer);
System.out.println(JoesHardware.subscribers.emlsubscribers.toString() + "\n");  //Unnecessary - Just confirm they are there
System.out.println(JoesHardware.subscribers.smssubscribers.toString() + "\n"); //Unnecessary - Just confirm they are there
JoesHardware.addStock(hammer, 10);// THIS IS THE TRIGGER - REMEMBER THE STOCK LEVEL FOR HAMMER IS CURRENTLY "0" ZERO
	}
}
