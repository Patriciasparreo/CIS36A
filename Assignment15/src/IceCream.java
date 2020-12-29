
/** PRACTICE VERSION -- NOT SUBMITTED!
 * @author FILL IN YOUR NAME
 * @author FILL IN YOUR NAME HERE
 * CIS 36A
 */
import java.util.Scanner;
public class IceCream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numChoc;
        int numVan;
        int numStraw;
        
        final double PRICE_CHOC = 3.50;
        final double PRICE_VAN = 3.25;
        final double PRICE_STRAW = 3.15;
        final double SUBTOTAL, TIP;
        final double SJ_TAX_RATE = 0.925; // PS
        
        String choice;
        
        System.out.println("Jingle Jingle! Place Your Order Here!\n");
        System.out.print("Enter the number of chocolate: ");
        numChoc = input.nextInt();
        
        System.out.print("Enter the number of vanilla: ");
        numVan = input.nextInt();
        
        System.out.print("Enter the number of strawberry: ");
        numStraw = input.nextInt();
        
        //Add more code here!
        SUBTOTAL = (numChoc * PRICE_CHOC) + (numVan * PRICE_VAN) + (numStraw * PRICE_STRAW);
        System.out.print("\nWould you like to tip:\n\nA: 10%\nB: 15%\nC: 20%\n\nEnter your choice: ");
        choice = input.next();
        if (choice.equalsIgnoreCase("A")) {
        	System.out.println("You chose 10%");
        	TIP = .1;
        }
        else if (choice.equalsIgnoreCase("B")) {
        	System.out.println("You chose 15%");
        	TIP = .15;
        }
        else if (choice.equalsIgnoreCase("C")) {
        	System.out.println("You chose 20%");
        	TIP = .2;
        }
        else {
        	System.out.println("You chose 20%");
        	TIP = .2;
        }
        System.out.print("\nWith taxes and tip, your total comes to $");
        displayTotal(SUBTOTAL, TIP);
        
        System.out.println("\n\nThank you! Please come again!");
        
        input.close(); // PS
    }
    
    //Write your methods AND JAVADOC COMMENTS here
    public static void displayTotal(double SUBTOTAL, double TIP) {
    	double updatedTotal = calculateTax(SUBTOTAL);
    	updatedTotal = calculateTip(updatedTotal, TIP);
    	System.out.printf("%.2f", updatedTotal);
    }
    
    public static double calculateTax(double SUBTOTAL) {
    	double updatedTotal = SUBTOTAL + (SUBTOTAL * .0925); // PS should use a variable not a # ?
    	return updatedTotal;
    }
    
    public static double calculateTip(double updatedTotal, double TIP) {
    	updatedTotal = updatedTotal + (updatedTotal * TIP);
    	return updatedTotal;
    }
    
}
