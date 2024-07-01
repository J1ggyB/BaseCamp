
public class EmailNotificationListener {        	
	//Fields-------------------------------------------------------------------------------------------------------------------------------------------------------
	private String email;   
    private Customer cust;
  //Constructor-----------------------------------------------------------------------------------------------------------------------------------------------  
		public EmailNotificationListener(String email, Customer cust) {  // Stores the email and Customer instance that relate to this particular listener
		this.email = email;
		this.cust = cust;
	}
	// Methods-------------------------------------------------------------------------------------------------------------------------------------------------	
	public Customer getCust() {     // Lets us check who is listening
		return cust;
	}
	public void update(Part part) {  // Simulates sending an email to particular customer to say the stock has been replenished (Takes in the part that was out of stock)
		if(cust.isEmlSubscriber()) {
				System.out.println("E-Mail To: " + email + " Message: Hi " + cust.getForename() + " Just to let you know we now have " + part.getInStockQty() + " " + part.getPartName() + "'s in Stock\n");
		}
	}
}

