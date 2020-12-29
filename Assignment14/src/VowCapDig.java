/** NOT FINAL - this was a practice version! -- NOT submitted!
 * @author Annelise Escudero
 * @author Patricia Sparreo
 * CIS 36A, Assignment 14: Vowels, Capitals and Digits
 */

import java.util.Scanner;

public class VowCapDig {

	public static int vowelCounter(String sentence) {
		int numVowels = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if ((sentence.charAt(i) == 'A') || (sentence.charAt(i) == 'E') || (sentence.charAt(i) == 'I') || (sentence.charAt(i) == 'O') || (sentence.charAt(i) == 'U') || (sentence.charAt(i) == 'a') || (sentence.charAt(i) == 'e') || (sentence.charAt(i) == 'i') || (sentence.charAt(i) == 'o') || (sentence.charAt(i) == 'u') ) {
				numVowels = numVowels + 1;
			}		
		}
		return numVowels;
	}
	
	public static int capitalCounter(String sentence) {
		int numCapitals = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if ((sentence.charAt(i) >= 65) && (sentence.charAt(i) <= 90)) {
				numCapitals = numCapitals + 1;
			}
		}
		return numCapitals;
	}
	
	public static boolean containsDigit(String sentence) {
		boolean hasDigit = false;
		for (int i = 0; i < sentence.length(); i++) {
			if ((sentence.charAt(i) >= 48) && (sentence.charAt(i) <= 57)) {
				hasDigit = true;
				i = sentence.length();
			}
		}
		return hasDigit;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome!\n");
		System.out.print("Enter a sentence or \"q\" to quit: ");
		String userSentence = input.nextLine();
		while (!userSentence.equalsIgnoreCase("q")) {
		
		// Count vowels
			int vowels = vowelCounter(userSentence);
			System.out.println("\nThere are " + vowels + " vowel(s) in the sentence.");
		
		// Count capital letters
			int capitals = capitalCounter(userSentence);
			System.out.println("There are " + capitals + " capital letter(s).");
		
		// Check for numerals
			boolean numerals = containsDigit(userSentence);
			if (numerals == false)
				System.out.println("The sentence does not contain digits.");
			else if (numerals == true)
				System.out.println("The sentence does contain digits.");
		
			
			System.out.print("\nEnter a sentence or \"q\" to quit: ");
			userSentence = input.nextLine();
		}
		System.out.println("Goodbye!");
		
		input.close();	
	}
}
