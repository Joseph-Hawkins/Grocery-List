public class GroceryItem {
	private String name; 
	private double price; 
	private boolean taxable;
	
	
	public GroceryItem (String name, double price, boolean taxable) {
		this.name = name;
		this.price = price;
		this.taxable = taxable;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean getTaxable() {
		return taxable;
	}
	
	public boolean equals(Object obj){
		/**
		 * returns true only if all the data field values of the two objects are the same
		 */
		return true;
	} 
	public String toString() { 
		return getName() + ": $" + String.format("%.2f", getPrice()) + " : " + getTaxable();
	}

	public static void main(String[] args) {
		GroceryItem item1 = new GroceryItem("milk", 2.00, false);
		System.out.println(item1);

	}

}

