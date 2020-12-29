/**
 * @author Patricia Sparreo
 * @author Annelise Escudero
 * CIS 36A Assignment 4
 */

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		System.out.println("***Math Worksheet***"); 
		
		Scanner getUserData = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		a = getUserData.nextDouble(); 
		
		System.out.print("Enter the second number: ");
		b = getUserData.nextDouble();
		
		System.out.print("Enter the third number: ");
		c = getUserData.nextDouble();
		
		System.out.println("exps = " + (a + b - c));
		System.out.println("smpl = " + (a * b * c));
		System.out.println("cels = " + ((5.0 / 9.0) * (a - 32)));
		System.out.println("fp = " + (a - Math.floor(a)));
		System.out.println("pymt = " + ((a * b) / (1 - Math.pow ((1 + b), -c))));
		
		getUserData.close();
		
	}  

}
