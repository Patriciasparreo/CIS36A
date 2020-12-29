/** 
* @author Patricia_Sparreo
* @author Annelise_Escudero
* CIS 36A, Assignment 10: 2020 Election
*/

import java.util.Scanner;

public class Election2020 {

	public static void main(String[] args) {

		System.out.println("***2020 Presidential Election!***");

		String vote;
		int biden = 0;
		int trump = 0;
		int west = 0;
		vote = "1";
		Scanner input = new Scanner(System.in);
		while (!vote.equalsIgnoreCase("X")) {

			System.out.println("\n\nCandidate 1: Joe Biden");
			System.out.println("Candidate 2: Donald Trump");
			System.out.println("Candidate 3: Kanye West");
			System.out.print("\n\nEnter your first choice (1-3) or X to exit: ");
			vote = input.next();
			if (vote.equals("1")) {
				System.out.println("You selected Joe Biden");
				biden++;
			} else if (vote.equals("2")) {
				System.out.println("You selected Donald Trump");
				trump++;
			} else if (vote.equals("3")) {
				System.out.println("You selected Kanye West");
				west++;
			} else if (vote.equalsIgnoreCase("X")) {
				System.out.println("\n\n***2020 Election Results!***");
				System.out.println("Joe Biden: \t" + biden);
				System.out.println("Donald Trump: \t" + trump);
				System.out.println("Kanye West: \t" + west);
			} else {

				System.out.println("Invalid selection. Please enter 1-3 or X only.");

			}

		}
		
		input.close();

	}

}