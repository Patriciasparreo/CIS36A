/**
* @author Annelise Escudero
* @author Patricia Sparreo
* CIS 36A, Assignment 7: String Manipulation
*/

import java.util.Scanner;

public class Manip {

	public static void main(String[] args) {
		
		System.out.println("*** String Manipulation ***");
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter two words separated by a space, and press the Enter key");
		System.out.print("Enter your input: ");
		
		String input1 = getInput.next();
		String input2 = getInput.next();
		System.out.println("\nYou entered: first = " + "" + "\"" + input1 + "\"" + " and second = " +  "\"" + input2 +  "\"");
		System.out.println("\nFirst word length: " + input1.length());
		System.out.println("Second word length: " + input2.length());
		
		System.out.print("\nLonger word: " );
		if (input1.length() > input2.length()) {
			System.out.println(input1);
		} else {
			System.out.println(input2);
		}
		if (input1.length() == input2.length()) {
			System.out.println("Words are the same length: true");
		} else {
			System.out.println("Words are the same length: false");
		}
		System.out.println("\nWords are the same: " + (input1.equals(input2)));
		
		System.out.println("\nMerged words: " + input1.charAt(0) + "" + input1.charAt(1) + input2.charAt(input2.length() - 2) + "" + input2.charAt(input2.length() - 1));
		
		if (input1.compareTo(input2) < 0 )
		{
			System.out.println("\nWord order: " + input1 + " comes before " + input2);
		} else {
			System.out.println("\nWord order: " + input2 + " comes before " + input1);	
		}
		

		getInput.close();
		
		} 
	}
