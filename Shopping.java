/**
 * This class is the user interface class that handles the input commands, 
 * output data and messages.
 * @author Joseph Hawkins, Gustavo Garcia
 *
 */
import java.util.Scanner;

public class Shopping {
	
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's start shopping!");
        String input = sc.nextLine();
        ShoppingBag bag = new ShoppingBag();
    	char command = 0;

        while (true) {
            String[] splitted = input.split("\\s+");
            
        	if(!splitted[0].equals("")) { // catches no input as invalid
            	command = splitted[0].charAt(0);
            }
          
            switch(command) {
	            case 'A':
	            	bag.add( new GroceryItem( splitted[1], Double.parseDouble(splitted[2]), 
	            			Boolean.parseBoolean(splitted[3])));
	            	break;
	           
	            case 'R':
	            	GroceryItem item = new GroceryItem( splitted[1], Double.parseDouble(splitted[2]), 
	            										Boolean.parseBoolean(splitted[3]));
	            	Boolean removed = bag.remove(item);
	            	
	            	if(removed) {
	            		System.out.println(item.getName() + " " 
	            							+ String.format("%.2f", item.getPrice()) + " removed.");
	            	}
	            	else {
	            		System.out.println("Unable to remove, this item not in the bag.");
	            	}
	            	
	            	break;
	            
	            case 'P':
	            	if(bag.isEmpty()) {
	            		System.out.println("The bag is empty!");
	            	}
	            	else {
	            		bag.print();
	            	}
	            	break;
	            
	            case 'Q':
            		System.out.println("Thanks for shopping with us!");
	            
            		if(bag.getSize() == 0) {
	            		return;
	            	}
            		
	            case 'C':
	            	if(bag.getSize() == 0) {
	            		System.out.println("Unable to checkout, the bag is empty!");
	            	}
	            	sc.close();
	            	return;
	            
	            default:
	            	System.out.println("Invalid Command!");
            }
            
            input = sc.nextLine();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Shopping item = new Shopping();

        item.run();

    }

}