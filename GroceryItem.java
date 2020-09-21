public class GroceryItem {
	private String name;
	private double price;
	private boolean taxable;
	
	/**
	 * Initializes values of a new GroceryItem.
	 * @param name Name of the GroceryItem.
	 * @param price Price of the GroceryItem.
	 * @param taxable True if GroceryItem is taxable, false otherwise.
	 */
	public GroceryItem(String name, double price, boolean taxable) {
		this.name = name;
		this.price = price;
		this.taxable = taxable;
	}
	
	/**
	 * Gets the name of a GroceryItem.
	 * @return name of GroceryItem.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the price of a GroceryItem.
	 * @return price of the GroceryItem.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Gets whether a GroceryItem is taxable or not. 
	 * @return true if taxable, false non-taxable.
	 */
	public boolean getTaxable() {
		return taxable;
	}
	
	/**
	 * Method returns true only if all the data field values of the two objects are the same.
	 * @param obj potential GroceryItem to compare. 
	 * @return true if GroceryItems are equal, false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof GroceryItem) {
			GroceryItem item = (GroceryItem) obj;//cast to grocery item WHY?

			if((this.name.equals(item.name)) && (this.price == item.price) && (this.taxable == item.taxable)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Gets a formatted string about the GroceryItem.
	 * @return itemName: $xx.xx : tax status.
	 */
	public String toString() {
		return getName() + ": $" + String.format("%.2f", getPrice()) + " : " + getTaxable();
	}

	public static void main(String[] args) {
		GroceryItem item1 = new GroceryItem("milk", 2.00, false);
		GroceryItem item2 = new GroceryItem("milk", 2.01, false);

		//test equality method
		System.out.println(item2.equals(item1));
		System.out.println(item1.equals(item2));
		System.out.println(item2.equals(item2));



	}

}
