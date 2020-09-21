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

        while ( !"Q".equals(input)) {

            String[] splitted = input.split("\\s+");

            char command = splitted[0].charAt(0);
            
            switch(command) {
            case 'A':
            	System.out.println("A**");
            }
            //if(splitted[0].equals())
            System.out.println("I WORK");

            input = sc.nextLine();
        }

        sc.close();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Shopping item = new Shopping();

        item.run();

    }

}