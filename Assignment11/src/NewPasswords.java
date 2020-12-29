/**
* @author Annelise Escudero
* @author Patricia Sparreo
* CIS 36A, Assignment 11: New Password
*/

import java.util.Scanner;

public class NewPasswords {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		String password;
		String passwordConfirm;
		final int MAX_TRIES = 5;
		
		System.out.print("Enter your new password: ");
		password = input.next();
		System.out.print("Enter your new password again: ");
		passwordConfirm = input.next();

		if (!password.equals(passwordConfirm)) {
			System.out.println("\nSorry! Those passwords don't match.\nPlease try again");
			System.out.print("\nEnter your new password again: ");
			passwordConfirm = input.next();
		}

		if (password.equals(passwordConfirm)) {
			System.out.println("\nPassword confirmed. Logging out...");
			for (int i = MAX_TRIES; i > 0; i--) {
				System.out.print("\nEnter your password: ");
				String passwordRecognition = input.next();
				if (passwordRecognition.equals(password)) {
					System.out.println("\nWelcome! You are now logged in.");
					i = 0;
				} else {
					System.out.print("Invalid password. You have " + (i - 1) + " more tries.\n");	
				}
			}

		} else {
			System.out.println("Sorry! Those passwords don't match.");
		}

		System.out.println("\nGoodbye!");

		input.close();

	}

}

        
    