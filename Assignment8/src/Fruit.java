
/**
* @author Annelise_Escudero Patricia_Sparreo
* CIS36A, Assignment 8
*/

import java.util.Scanner;

public class Fruit {
	
	public static void main(String[] args) {
		
		Scanner fruit = new Scanner(System.in);
		
		System.out.print("Enter the fruit code: ");
		
		String code = fruit.next();
		
		
	
		if (code.length() == 4)
		{
			System.out.println("Your fruit was grown conventionally, with the use of pesticides and chemicals.");
		}
		else if ((code.length() == 5) && (code.charAt(0) == ('8')))
		{
			System.out.println("Your fruit was genetically modified.");
		}
		else if ((code.length() == 5) && (code.charAt(0) == ('9')))
		{
			System.out.println("Your fruit was not genetically modified, and was grown according USDA organic standards.");
		}
		else 
		{
			System.out.println("Invalid code. Please try again.");
		}

		fruit.close();
	}
	
}