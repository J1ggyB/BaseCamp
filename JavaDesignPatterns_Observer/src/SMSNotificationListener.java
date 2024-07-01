
public class SMSNotificationListener {
	//Fields----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	private String sms;
		private Customer cust;
//Constructor---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			public SMSNotificationListener(String sms, Customer cust) {  // // Stores the mobile No and Customer instance that relate to this particular listener
				this.sms = sms;
				this.cust =  cust;
			}
	//Methods-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		public Customer getCust() {		// Lets us check who is listening
				return cust;
			}
		
		public void update(Part part) {  // Simulates sending an SMS to particular customer to say the stock has been replenished (Takes in the part that was out of stock)
			if(cust.isSmsSubscriber()) {
			System.out.println("SMS To: " + sms + " Message: Hi " +  cust.getForename() + " Just to let you know we now have " + part.getInStockQty() + " " + part.getPartName() + "'s  in Stock\n");
			}
		}
	}


