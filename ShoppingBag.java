public class ShoppingBag {
	private GroceryItem[] bag; // array-based implementation of the bag
	private int size; // number of items currently in the bag
	
	/**
	 * Constructor for ShoppingBag, initializes to default sizes.
	 */
	public ShoppingBag() {
		this.bag = new GroceryItem [5];
		this.size = 0;
		
	}

	/**
	 * Search the ShoppingBag for a specific GroceryItem.
	 * @param item GroceryItem that we are searching for in the ShoppingBag.
	 * @return index of the GroceryItem we were searching for.
	 */
	private int find(GroceryItem item) {
		for(int i = 0; i < size; i++) {
			if(bag[i].equals(item)) {
				return i;
			}
		}
		return -1;

	} // helper method to find an item

	/**
	 * Helper method to make ShoppingBag larger by 5.
	 */
	private void grow() { // grow size by 5 when bag is full
		GroceryItem[] tempBag = new GroceryItem[size + 5];
		for (int i = 0; i < size; i++) {
			GroceryItem t = bag[i];
			tempBag[i] = t;
		}
		bag = tempBag;
	} // helper method to grow the capacity

	/**
	 * Adds a GroceryItem to the shopping bag.
	 * @param item GroceryItem to be added to the bag.
	 */
	public void add(GroceryItem item) {
		if(size < bag.length) {
			bag[size] = item;
			size++;
			System.out.println(item.getName() + " added to the bag.");
			return;
		}
		grow();
		add(item);
		return;	
	}

	/**
	 * Removes the first instance of item from the ShoppingBag.
	 * If there are more than one matching item, 
	 * remove the first item found in the bag.
	 * @param item Item to be removed from the ShoppingBag.
	 * @return True if the remove was successful, false otherwise.
	 */
	public boolean remove(GroceryItem item) {
		int itemIndex = find(item);
		
		if(itemIndex == -1) {
			return false;
		}
		
		bag[itemIndex] = bag[size - 1];
		bag[size - 1] = null;
		size --;
		return true;
	}

	/**
	 * Price of all items in the ShoppingBag before tax is applied.
	 * @return Total cost of items before tax.
	 */
	public double salesPrice() {
		double salesPrice = 0;
		
		for(int i = 0; i < size; i++) {
			salesPrice += bag[i].getPrice();
		}
		
		return salesPrice;

	}

	/**
	 * Total sales tax of all items in the ShoppingBag.
	 * @return Sales tax in the form of a double.
	 */
	public double salesTax() {
		double salesTax = 0;
		
		for(int i = 0; i < size; i++) {
			if(bag[i].getTaxable()) {
				salesTax += (bag[i].getPrice() * 0.06625) ;
			}
		}
		
		return salesTax;
	}

	/**
	 * Prints number of items and contents of ShoppingBag.
	 */
	public void print() {
		System.out.println("**You have " + size + " items(s) in the bag:");
		
		for(int i = 0; i < size; i++) {
			System.out.println(bag[i].toString());
		}
		
		System.out.println("**End of list");
	}
	
	/** 
	 * Returns the number of items in the ShoppingBag.
	 * @return Number of items in the ShoppingBag in form of an int.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Returns true if the bag is empty.
	 * @return True if the bag is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		GroceryItem item1 = new GroceryItem("milk", 2.00, true);
		GroceryItem item2 = new GroceryItem("not milk", 2.00, false);

		ShoppingBag arr = new ShoppingBag();
		arr.add(item1);
		arr.add(item1);
		arr.add(item2);
		arr.add(item1);
		arr.add(item1);
		arr.add(item1);

		arr.remove(item2);

		arr.print();
		
		System.out.println("Sales Price: " + arr.salesPrice());
		System.out.println("Sales Tax: " + arr.salesTax());

		
	}

}
