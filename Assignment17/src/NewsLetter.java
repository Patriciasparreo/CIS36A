/**
 * @author Annelise Escudero
 * @author Patricia Sparreo
 * CIS 36A, Assignment 17.1: Newsletter Subscriptions
 */
import java.util.Scanner;

public class NewsLetter {
    /**
     * Removes all blank spaces in front of
     * and at the end of a String
     * @param email the email address
     * @return an email with no blank spaces
     * at the front or end of the String
     */
    public static String cutSpace(String email) {
       
    	//write one while loop here
        int cutFromFront = 0;
        int i = 0;
        while (email.charAt(i) == ' ') {
        	cutFromFront++;
        	i++;
        }
        i = email.length() - 1;	
        //write the second while loop here
        int cutFromBack = 0;
        while (email.charAt(i) == ' ') {
        	cutFromBack++;
        	i--;
        }
        int start = cutFromFront;
        int end = email.length() - cutFromBack;
        email = email.substring(start,end);
        return email;
    }
      
    
    /**
     * Searches a String for an @ character
     * @param email the String to search
     * @return whether the String contains an '@'
     */
    public static boolean hasAt(String email) {
        //write a for loop here to iterate through the String email
        boolean hasAt = false;
        for (int i = 0; i < email.length(); i++) {
        	if (email.charAt(i) == '@') {
        		hasAt = true;
        		i = email.length();
        	}
        }
    	return hasAt;        
    }
    
    /**
     * Uses a for loop to iterate through an array of
     * correct email extensions, comparing the last 4 
     * characters in a String parameter to each correct
     * extension. 
     * @param email the String, whose last 4 chars is
     * compared to each extension
     * @return whether or not the last 4 chars match one
     * of the extensions
     */
    public static boolean correctExtension(String email) {
        //source: https://en.wikipedia.org/wiki/List_of_Internet_top-level_domains
        String[] extensions = {".com", ".net", ".org", ".edu", ".gov", ".int"};
        //write a for loop here to iterate through the array extensions
        boolean hasExt = false;
        String extension = email.substring((email.length() - 4), email.length());
        for (int i = 0; i <= 5; i++) {
        	if (extension.equals(extensions [i])) {
        		hasExt = true;
        		i = 5;
        	}
        }	
        return hasExt;
    }
    
    /**
     * Determines whether a String contains a space
     * @param email the String to search for a space
     * @return whether the String contains a space
     */
    public static boolean containsASpace(String email) {
        //Write a for loop here to iterate through the String email
        boolean hasSpace = false;
    	for (int i = 0; i < email.length(); i++) {
        	if (email.charAt(i) == ' ') {
        		hasSpace = true;
        		i = email.length();
        	}
    	}
    	return hasSpace;
    }
    
    
    public static void main(String[] args){  
        Scanner input = new Scanner(System.in);
        int numEmails;
        String email;        
 
        System.out.println("Welcome to our newsletter subscription service!\n");
        System.out.print("Enter the number of emails to subscribe: ");
        //check for input mismatch exception with a while loop
        while (!input.hasNextInt()) { 
        	System.out.println("\nError! Please enter a number not text!");
        	System.out.print("Enter the number of emails to subscribe: "); 
        	input.nextLine();
        }
        numEmails = input.nextInt();
        input.nextLine();
        //declare your array of Strings here
        String[] emailAddresses = new String[numEmails];
        //write a for loop here with if-else if-else if- else
        //In each if and else if statement, call one of your methods
        for (int i = 0; i < emailAddresses.length; i++) {
        	System.out.print("\nEnter email #" + i + ": ");
        	email = input.nextLine();
        	// below, is the method that automatically deletes white space
        	// at beginning and end, without any user interaction
        	email = cutSpace(email);
        	
        	if (hasAt(email) == false) { 
        		System.out.println("Error! The email address must contain an @ symbol");        		
            	i--;
        		
        	} else if (correctExtension(email) == false) {
        		System.out.println("Error! The email address must have a valid extension");       		
            	i--;
            	
        	} else if (containsASpace(email) == true) {
        		System.out.println("Error! The email address cannot contain spaces");        		
            	i--;
        	} else {
        		emailAddresses[i] = email;
        	}
        }
        
        System.out.println("\nYou entered the following emails:\n");
        //print the array to the console with a for loop
        for (int i = 0; i < emailAddresses.length; i++) {
        	System.out.println(i + ". " + emailAddresses[i]);
        }
        input.close();
    }  
}
