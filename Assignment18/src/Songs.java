/**
 * @author Patricia Sparreo
 * @author Annelise Escudero
 * CIS 36A, Assignment 18: Billboard Top Songs
 */


import java.util.Scanner;
import java.io.*;

public class Songs {

	public static void main(String[] args) throws IOException {
		String[] titles = new String[10];
		int[] weeks = new int[10];	
		File songTitle = new File("names.txt");
		Scanner input = new Scanner(songTitle);
		for (int i = 0; i < titles.length; i++) {
			titles[i] = input.nextLine();
		}						
		input.close();
		
		File numWeeks = new File("weeks_chart.txt");
		input = new Scanner(numWeeks);
		for (int i = 0; i < weeks.length; i++) {
			weeks[i] = input.nextInt();
		}		
		input.close();
		
		// next lines write the contents of the array to the output text file
		File chart = new File("chart.txt");
		PrintWriter out = new PrintWriter(chart);
		out.println("Billboard Top 10 Tracks - November, 2020");
		for (int i = 0; i < 10; i++) {
			out.println(titles[i] + ": " + weeks[i] + " weeks");
		}
		
		out.close();
	}

}
