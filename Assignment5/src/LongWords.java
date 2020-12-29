
/**
* @author Patricia_Sparreo
* @author Annelise_Escudero
* CIS 36A, Assignment 5
*/

import java.util.Scanner;

public class LongWords {

	public static void main(String[] args) {

		String firstLongWord;
		String secondLongWord;
		Scanner longwords = new Scanner(System.in);
		
		System.out.print("Enter a really long word: ");
		firstLongWord = longwords.next();
		System.out.println("The length of " + firstLongWord + " is " + firstLongWord.length() + " ");
		System.out.println("The first letter is at index 0, and the last letter is at index " + (firstLongWord.length() - 1));
		System.out.println("The first letter is " + firstLongWord.charAt(0));
		System.out.println("The last letter is " + firstLongWord.charAt(firstLongWord.length() - 1));

		System.out.print("Enter another long word: ");
		secondLongWord = longwords.next();
		System.out.println("The length of " + secondLongWord + " is " + secondLongWord.length() + " ");
		System.out.println("The first letter is at index 0, and the last letter is at index " + (secondLongWord.length() - 1));
		System.out.println("The first letter is " + secondLongWord.charAt(0));
		System.out.println("The last letter is " + secondLongWord.charAt(secondLongWord.length() - 1));
		System.out.println("Concatenating the two words: " + firstLongWord + "-" + secondLongWord);
		
		longwords.close();
		
	}

}
