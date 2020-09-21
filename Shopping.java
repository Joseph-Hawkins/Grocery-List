import java.util.Scanner;

/**
 * This class is the user interface class that handles the input commands, 
 * output data and messages.
 * @author Joseph Hawkins, Gustavo Garcia
 *
 */
public class Shopping {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's start shopping!");
        String input = sc.nextLine();
        
        ShoppingBag bag = new ShoppingBag();
        
        while ( !"Q".equals(input)) {
            String[] splitted = input.split("\\s+");
            char command = splitted[0].charAt(0);
          
            switch(command) {
	            case 'A':
	            	System.out.println("Adding Item!");
	            	break;
	            case 'R':
	            	System.out.println("Removing Item!");
	            	break;
	            case 'P':
	            	System.out.println("Printing Cart!");
	            	break;
	            case 'C':
	            	System.out.println("Checking Out!");
	            	break;
	            default:
	            	System.out.println("Invalid Command!");
            }
            
            input = sc.nextLine();
        }
        
        if ( bag.getSize() != 0 ) {
        	System.out.println("Checking Out!");
        	System.out.println("Thanks for shopping with us!");
        } 
        
        sc.close();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Shopping item = new Shopping();

        item.run();

    }

}