
public class Part {  // Define Class
	
// Fields--------------------------------------------------------------------------------Simple Class nothing of note-------------------------------------------------------------------------------------------------------
	private int partNo;
	private String partName;
	private int inStockQty;
	private double price;
	
	//Constructor-----------------------------------------------------------------------------------
	public Part(int partNo, String partName, int qty, double price) {
		super();
		this.partNo = partNo;
		this.partName = partName;
		inStockQty = qty;
		this.price = price;
	}
	//Getters & Setters------------------------------------------------------------------------------

	public int getPartNo() {
		return partNo;
	}

	public void setPartNo(int partNo) {
		this.partNo = partNo;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getInStockQty() {
		return inStockQty;
	}

	public void setInStockQty(int qty) {
		inStockQty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
