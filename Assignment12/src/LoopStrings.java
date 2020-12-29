/**
* @author Annelise Escudero
* @author Patricia Sparreo
* CIS 36A, Assignment 12: Strings in a Loop
*/
import java.util.Scanner;

public class LoopStrings {

	public static void main(String[] args) {
		String statement;
		String character;
		int integer;
		Scanner input = new Scanner(System.in);

		System.out.println("*** Fun with Loops and Strings ***");
		System.out.print("Enter a String statement: ");
		statement = input.nextLine();
		System.out.print("Enter one character: ");
		character = input.next();
		System.out.print("Enter an integer between 1 and 19: ");
		integer = input.nextInt();

		// #1
		System.out.println("\nPrinting a string of " + character + "'s the length of the String");
		System.out.println("\t" + statement);
		System.out.print("#1: \t");

		for (int i = statement.length(); i > 0; i--) {
			System.out.print(character);
		}
		System.out.println("\n" + (character) + "-out the String\n");

		// #2
		System.out.println("Alternating printing " + integer + " with the odd letters of the String");
		System.out.print("#2: ");
		for (int i = 1; i <= statement.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(statement.charAt(i - 1));
			} else {
				System.out.print(integer);
			}
		}
		System.out.println("\nAn alteration from enumeration!");

		// #3
		System.out.println("\nAlternating printing " + character + " with the even letters of the String");
		System.out.print("#3: ");
		for (int i = 1; i <= statement.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(character);
			} else {
				System.out.print(statement.charAt(i - 1));
			}
		}
		System.out.println("\nAn alteration from a " + character + " designation!");

		// #4
		System.out.println("\n\n#4: Printing the first letters of the String from length to one.");
		for (int i = statement.length(); i >= 1; i--) {
			System.out.println(statement.substring(0, i));
		}
		System.out.println("Fading fast!");
		
		// #4REVISED written as a nested loop:
		System.out.println("\n\n#4REVISED: Printing the first letters of the String from length to one.");
		for (int row = statement.length(); row > 0; row--) {
			for (int letter = 0; letter <= row - 1; letter++) {
				System.out.print(statement.charAt(letter));
			}
			System.out.println("");
		}
		System.out.println("Fading fast!");

		// #5
		System.out.println("\nPrinting " + integer + "!, the product of the numbers between 1 and " + integer + ".");
		long sum = 1;
		for (int i = 1; i <= integer; i++) {
			sum = sum * i;
		}
		System.out.println("#5: " + sum);
		System.out.println("Also known as a factorial!");

		// #6
		System.out.println("\nPrinting " + statement + " with all words capitalized.");
		System.out.print("#6: ");
		for (int i = 0; i < statement.length(); i++) {
			if (i == 0) {
				System.out.print(statement.substring(i, i + 1).toUpperCase());
			} else if (statement.charAt(i) == ' ') {
				System.out.print(statement.charAt(i));
				System.out.print(statement.substring(i + 1, i + 2).toUpperCase());
				i++;
			} else {
				System.out.print(statement.charAt(i));
			}
		}
		System.out.println("\nThat was a challenge!");

		input.close();
	}
}
