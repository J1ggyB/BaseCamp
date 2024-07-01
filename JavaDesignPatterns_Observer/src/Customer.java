
public class Customer {		//Class Def
	//Fields---------------------------------------------------------------------------------------------------------------------------------------
	private String forename;
    private String surname;
    private String email;
    private String mobile;
 	private Part interest;                                                          //Holds the part the customer has expressed an interest in (Could be an Array but kept it simple)
	private boolean isEmlSubscriber = false;				// Are they interested in receiving emails?
	private boolean isSmsSubscriber = false;				//Are they interested in receiving SMS messages?
	//Constructor-----------------------------------------------------------------------------------------------------------------------------
	public Customer(String forename, String surname, String email, String mobile) {  //Creates a basic customer without subscriptions or interests as yet
		super();
		this.forename = forename;
		this.surname = surname;
		this.email = email;
		this.mobile = mobile;
	}
//Methods -----------------------------------------------------------------------------------Just Getters and Setters---------------------------------------------
	public boolean isEmlSubscriber() {
		return isEmlSubscriber;
	}
	public void setEmlSubscriber(boolean isEmlSubscriber) {
		this.isEmlSubscriber = isEmlSubscriber;
	}
	public boolean isSmsSubscriber() {
		return isSmsSubscriber;
	}
	public void setSmsSubscriber(boolean isSmsSubscriber) {
		this.isSmsSubscriber = isSmsSubscriber;
	}

	public void setInterest(Part part) {
		this.interest= part;
	}
	public Part getInterest(){
		return this.interest;
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	   public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
    
}
