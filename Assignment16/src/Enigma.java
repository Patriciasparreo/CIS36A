/**
 * @author Annelise Escudero
 * @author Patricia Sparreo
 * Assignment 16: The Enigma Machine
 */

import java.util.Scanner;
public class Enigma {
	
/**
 * This method creates an encrypted message
 * @param message sentence that gets encrypted
 */
	public static void encrypt(String message) {
		String encryption = "";
		for (int i = 0; i < message.length(); i++) {
			int unicode = message.charAt(i);
			int firstDigit = unicode / 10;
			int secondDigit = unicode % 10;
			char uniDigit1 = (char)(firstDigit + 48);
			char uniDigit2 = (char)(secondDigit + 48);
			encryption = "" + uniDigit1 + uniDigit2;
			System.out.print(encryption);	
		}
	}
	
/**
 * This method decodes an encrypted message	
 * @param encrypted the encrypted message
 */
	public static void decrypt(String encrypted) {
		String decryption = "";
		for (int i = 0; i < encrypted.length(); i += 2) {
			int char1 = encrypted.charAt(i);
			char char2 = encrypted.charAt(i + 1);
			char1 = (char1 - 48);
			char2 = (char)(char2 - 48);
			char letter = (char)((char1 * 10) + char2);
			decryption = decryption + letter;	
		}
		System.out.print(decryption);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("*** Unicode Encryption ***");
		String command = "";
		System.out.print("\n\nEnter \"e\" to encrypt, \"d\" to"
				+ " decrypt or \"x\" to exit (e/d/x): ");
		command = input.nextLine();
		String message;
			
		while (!command.equalsIgnoreCase("x")) {
			
			if (command.equalsIgnoreCase("e")) {
				System.out.print("Enter the String to encrypt: ");
				message = input.nextLine();
				System.out.print("ciphertext: ");
				encrypt(message);
			} else if (command.equalsIgnoreCase("d")) {
				System.out.print("Enter the String to decrypt: ");
				message = input.nextLine();
				System.out.print("plaintext: ");
				decrypt(message);
			} else {
				System.out.println("Unrecognized command: " + command);
			}
			System.out.print("\n\nEnter \"e\" to encrypt, \"d\" to"
					+ " decrypt or \"x\" to exit (e/d/x): ");
			command = input.nextLine();
		}
	
		System.out.println("\nGoodbye.");
			
		input.close();
	}
}
