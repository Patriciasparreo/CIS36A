/**
 * @author Patricia Sparreo
 * @author Annalise Escudero
 * CIS 36A, Assignment 19: Tracking Customers
 */
import java.util.Scanner;
import java.io.*;

public class TrackCustomers {

    /**
     * This method reads in a customer's first name and returns
     * the customer's first initial
     * @param name the customer's first name
     * @return the initial of the customer's first name
     */
    public static char extractInitial(String name) {
    	char initial;
    	initial = name.charAt(0);    			
        return initial;	
     }
    	 
  /**
   * This method reads in a string array of customer names and writes it to the user's output file
   * @param customerList a string array of formatted customer names
   * @param OUTPUT_FILE the file, chosen by user, to write the data to
   * @throws IOException
   */
    
    public static void printArray(String[] customerList, String OUTPUT_FILE) throws IOException {
    	File moveData = new File(OUTPUT_FILE);
    	PrintWriter out = new PrintWriter(moveData);
    	for (int i = 0; i < customerList.length; i++) {
    		out.println(customerList[i] + "");
    	}
    	out.close();
    }
    
    public static void main(String[] args) throws IOException {
          
        String name, gender;
        final int ARRAY_SIZE;       
        final String INPUT_FILE;
        final String OUTPUT_FILE;
        
        System.out.println("Welcome to Customer Tracker!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the input file: ");
        INPUT_FILE = input.next();        
        System.out.print("Enter the name of the output file: ");
        OUTPUT_FILE = input.next();
        input.close();
        
        File anything = new File(INPUT_FILE);
        input = new Scanner(anything);
        int count1 = 0;
        while (input.hasNextLine()) {
        	input.nextLine();
        	count1++;
        }
        ARRAY_SIZE = count1;                  
        input.close();
                
      //Use a while loop and hasNextLine() - required!
        String[] customerList = new String[(ARRAY_SIZE -1) / 2];
        File names = new File(INPUT_FILE);
        input = new Scanner(names);
        input.nextLine(); // reads the first number in data file
        int i = 0;
        while (input.hasNextLine()) {
        	name = input.next();
        	char initial = extractInitial(name);
        	name = input.next();
        	gender = input.next();
        	String title;
        	if (gender.equals("F")) {
        		title = "Ms.";
        	} else if (gender.equals("M")) {
        		title = "Mr.";
        	} else {
        		title = "Mx.";
        	}
        	customerList[i] = title + " " + initial + ". " + name;	
        	i++;
        }		
        input.close();		
     
        // Then call the method that "prints" the array to the "out file"
        printArray(customerList, OUTPUT_FILE); 
    }
}
