/*
 Author: Nadia Riley
 Title: Lab II Programming Assignment (Problem 2)
 Date: September 14, 2026
 Description: Calculate the monthly Internet bill.
*/

import java.util.Scanner;
public class MonthlyInternetBill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Display package options
		System.out.println("Internet Service Provider - Subscription Packages");
		System.out.println("1: $9.95 per month for 10 hours, additional hours $2.00 each.");
		System.out.println("2: $13.95 per month for 20 hours, additional hours $1.00 each.");
		System.out.println("3: $19.95 per month for unlimited access.");
		
		// Prompt UI
		System.out.print("Enter the package number (1, 2, or 3): ");
		int packageSelection = scan.nextInt();
		System.out.print("Enter the number of hours used: ");
		int hours = scan.nextInt();
		
		// Calculate and display bill amount
		double price = 0;
		switch (packageSelection) 
		{
		case 1:
			price = 9.95;
			if (hours > 10) {
				price += (hours - 10) * 2.00;
			}
			break;
		case 2:
			price = 13.95;
			if (hours > 20) {
				price += (hours - 20) * 1.00;
			}
			break;
		case 3:
			price = 19.95;
			break;
		}
		System.out.println("Your total monthly charge is: $" + price);
		
		scan.close();
	}

}
