/**
* @author Patricia Sparreo
* @author Annelise Escudero
* CIS 36A, Assignment 9: Java Jive Pastries and Cafe
*/

import java.util.Scanner;

public class Pastries {

	public static void main(String[] args) {
		Scanner getOrder = new Scanner(System.in);
		final double PRICE_ECLAIR = 3.95;
		final double PRICE_COOKIE = 2.50;
		final double PRICE_CAKE = 5.50;
		final double PRICE_BROWNIE = 4.50;
		
		System.out.println("Welcome to Java Jive Pastries and Cafe!");
		System.out.println("Allow me to assist you with your order.\n");
		System.out.println("We sell the following desserts:");
		
		
		System.out.printf("Mocha Eclairs -- $%.2f each\n", PRICE_ECLAIR);
		System.out.printf("Cocoa Cookies -- $%.2f each\n", PRICE_COOKIE);
		System.out.printf("Coffee Cake -- $%.2f per slice\n", PRICE_CAKE);
		System.out.printf("Java Jive Brownies -- $%.2f each\n\n", PRICE_BROWNIE);
		
		
		System.out.print("Please enter the number of Mocha Eclairs: ");
		int numEclairs = getOrder.nextInt();
		
		System.out.print("Please enter the number of Cocoa Cookies: ");
		int numCookies = getOrder.nextInt();
		
		System.out.print("Please enter the number of slices of Coffee Cake: ");
		int numCakes = getOrder.nextInt();
		
		System.out.print("Please enter the number of Java Jive Brownies: ");
		int numBrownies = getOrder.nextInt();
		
		
		System.out.println("\nYou Ordered the Following: ");
		System.out.printf("Mocha Eclairs: " + numEclairs + " @ %.2f each...\t\t $%.2f \n", PRICE_ECLAIR,  (PRICE_ECLAIR * numEclairs));
		
		System.out.printf("Cocoa Cookies: " + numCookies + " @ %.2f each...\t $%.2f \n", PRICE_COOKIE, (PRICE_COOKIE * numCookies));
		
		System.out.printf("Coffee Cake: " + numCakes + " @ %.2f each...\t\t $%.2f \n", PRICE_CAKE, (PRICE_CAKE * numCakes));
		
		System.out.printf("Java Jive Brownies: " + numBrownies + " @ %.2f each...\t $%.2f \n", PRICE_BROWNIE, (PRICE_BROWNIE * numBrownies));
		
		double total = (PRICE_ECLAIR * numEclairs) + (PRICE_COOKIE * numCookies) + (PRICE_CAKE * numCakes) + (PRICE_BROWNIE * numBrownies);
		System.out.printf("\nTotal: \t\t\t\t\t $%.2f", total);
			
		System.out.print("\n\nThank you for your order! Please come again!");
		
	
		getOrder.close();
	}

}
