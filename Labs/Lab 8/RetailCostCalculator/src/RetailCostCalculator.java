/*
 Author: Nadia Riley
 Title: Lab 8 Programming Assignment (Problem 1)
 Email: rilen01@purdue.edu
 Date: November 15, 2026
 Description: Calculate the retail price based on user-input wholesale price and markup percentage.
*/
import java.util.Scanner;
// Calculation method
public class RetailCostCalculator {
	public static double calculateRetail (double x, double p) {
		double retail = x + ((p/100) * x);		
		return retail;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Prompt UI
		System.out.print("Enter the wholsesale cost: ");
		double wholesale = scan.nextDouble();
		System.out.print("Enter the markup percentage (%): ");
		double markup = scan.nextDouble();
		// Call method within formatted print statement
		System.out.printf("Retail price = %.2f", calculateRetail(wholesale, markup));
		scan.close();
	}
}
