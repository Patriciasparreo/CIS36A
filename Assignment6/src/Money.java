/**
* @author Annelise Escudero
* @author Patricia Sparreo
* CIS 36A, Assignment 6
*/

import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		Scanner getPrice = new Scanner(System.in);
		
		System.out.print("Enter the price: ");
		String price = getPrice.next();
		if (price.charAt(0) == '$')
			if (price.charAt(price.length() - 3) == '.') {
			System.out.println("You entered a valid price");
			} else {
				System.out.println("You entered an invalid price");
			}
		else {
			System.out.println("You entered an invalid price");
		}

	getPrice.close();
	}	

}
