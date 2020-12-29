/**
* @author Annelise Escudero
* @author Patricia Sparreo
* CIS 36A, Assignment 13: Fiber Counter
*/
import java.util.Scanner;

public class Fiber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Welcome to the fiber counter!\n" + "Let's calculate your daily fiber consumption for the day.");
		// (PS) initializing TWO string variables on the line below!
		String date = "", response = "";
		double numServings = 0.0;
		double totalFiber = 0.0;

		// below are the grams of fiber per serving of each menu option
		final double APPLE = 3.7;
		final double BEANS = 14.7;
		final double WHITE_BREAD = 1.0;
		final double WHEAT_BREAD = 2.0;
		final double BURGER = 2.0; // 2 grams due to the burger bun
		final double CARROT = 2.0;
		final double CHICKEN = 0.0;
		final double EGG = 0.0;
		final double PASTA = 2.0;
		final double POTATO = 2.0;
		final double RASPBERRY = 8.4;
		final double BROWN_RICE = 3.5;
		final double WHITE_RICE = 1.0;
		final double STRAWBERRY = 3.4;
		final double STEAK = 0.0;

		// use a do-while loop here
		do { //(PS)

			System.out.println("\nPlease select from the following list of foods:\n");
			System.out.println("1. Apple (1)");
			System.out.println("2. Beans (1 cup)");
			System.out.println("3. Bread - White (1 slice)");
			System.out.println("4. Bread - Whole Wheat (1 slice)");
			System.out.println("5. Burger (1)");
			System.out.println("6. Carrot (1 medium)");
			System.out.println("7. Chicken (8 oz)");
			System.out.println("8. Egg (1)");
			System.out.println("9. Pasta (1 cup)");
			System.out.println("10. Potato (1)");
			System.out.println("11. Raspberries (1 cup)");
			System.out.println("12. Rice - Brown (1 cup)");
			System.out.println("13. Rice - White (1 cup)");
			System.out.println("14. Strawberries (1 cup)");
			System.out.println("15. Steak (8 ozs)");
			System.out.print("\nEnter your selection or X to exit: ");
			response = input.nextLine();
			// add code inside loop here
			
			// (PS)System.out.print("\nNow enter the number of servings: ");
			//     numServings = input.nextDouble();
			//     These 2 lines of code don't work here because her sample output doesn't
			//     print this line when the User input "X" to quit.
			
			// (PS) Added lines 65 - 155
			if (response.equals("1")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine(); // (PS) This is the line that corrects the unwanted repeat of list of foods!!
				totalFiber = totalFiber + (APPLE * numServings);
				System.out.println("\nYou selected " + numServings + " servings of apple.");
			} else if (response.equals("2")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (BEANS * numServings);
				System.out.println("\nYou selected " + numServings + " servings of beans.");
			} else if (response.equals("3")) {	
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (WHITE_BREAD * numServings);
				System.out.println("\nYou selected " + numServings + " servings of white bread.");
			} else if (response.equals("4")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (WHEAT_BREAD * numServings);
				System.out.println("\nYou selected " + numServings + " servings of whole wheat bread.");
			} else if (response.equals("5")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (BURGER * numServings);
				System.out.println("\nYou selected " + numServings + " servings of burger.");
			} else if (response.equals("6")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (CARROT * numServings);
				System.out.println("\nYou selected " + numServings + " servings of carrot.");
			} else if (response.equals("7")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (CHICKEN * numServings);
				System.out.println("\nYou selected " + numServings + " servings of chicken.");
			} else if (response.equals("8")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (EGG * numServings);
				System.out.println("\nYou selected " + numServings + " servings of egg.");
			} else if (response.equals("9")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (PASTA * numServings);
				System.out.println("\nYou selected " + numServings + " servings of pasta.");
			} else if (response.equals("10")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (POTATO * numServings);
				System.out.println("\nYou selected " + numServings + " servings of potato.");
			} else if (response.equals("11")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (RASPBERRY * numServings);
				System.out.println("\nYou selected " + numServings + " servings of raspberries.");
			} else if (response.equals("12")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (BROWN_RICE * numServings);
				System.out.println("\nYou selected " + numServings + " servings of brown rice.");
			} else if (response.equals("13")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (WHITE_RICE * numServings);
				System.out.println("\nYou selected " + numServings + " servings of white rice.");
			} else if (response.equals("14")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (STRAWBERRY * numServings);
				System.out.println("\nYou selected " + numServings + " servings of strawberries.");
			} else if (response.equals("15")) {
				System.out.print("Now enter the number of servings: "); 
				numServings = input.nextDouble();
				input.nextLine();
				totalFiber = totalFiber + (STEAK * numServings);
				System.out.println("\nYou selected " + numServings + " servings of steak.");
			}

			
			
			// end loop
	// (PS) Added lines 161 - 164
		} while (!response.equalsIgnoreCase("X"));

		System.out.print("Now enter today's date: ");
		date = input.nextLine();
	    System.out.println("\nHere is your fiber summary for " + date + ":\n");
		System.out.printf("Total grams consumed: %.1f\n", totalFiber);
// (PS) Added the test conditions for the if-else's in lines below:	        
	    if (totalFiber < 15) {
	    	System.out.println("You need to eat A LOT more fiber. \nYou should double or triple your intake.");
	    }
	    else if ((totalFiber >= 15) && (totalFiber < 30)) {
	    	System.out.println("You eat the average amount of daily fiber for an American.\n"+"You need to increase your intake to at least 30 grams/day.");
	    }
		else if ((totalFiber >= 30) && (totalFiber < 40)) {
			System.out.println("You eat the recommended daily allowance of fiber, but you could eat more.");
		}
		else {
			System.out.println("You're a fiber superstar! Keep up the good work!");
		}

		input.close();
	}
}
