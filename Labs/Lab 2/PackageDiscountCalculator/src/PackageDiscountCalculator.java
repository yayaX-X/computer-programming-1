/*
 Author: Nadia Riley
 Title: Lab II Programming Assignment (Problem 1)
 Date: September 14, 2026
 Description: Calculate the total price of software package purchase.
*/

import java.util.Scanner;
public class PackageDiscountCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Prompt UI
		System.out.print("Enter the number of packages purchased: ");
		int packageAmount = scan.nextInt();
		
		// Calculate total cost
		double initialCost = 99 * packageAmount;
		
		// Determine discount percentage
		double discountPercent = 0;
		if(packageAmount >= 10 && packageAmount <= 19) {
			discountPercent = 0.20;
		}
		if(packageAmount >= 20 && packageAmount <= 49) {
			discountPercent = 0.30;
		}
		if(packageAmount >= 50 && packageAmount <= 99) {
			discountPercent = 0.40;
		}
		if(packageAmount >= 100) {
			discountPercent = 0.50;
		}
		
		// Calculate discount amount
		double discountAmount = initialCost * discountPercent;
		System.out.println("Discount applied: $" + discountAmount);
		
		// Calculate final cost
		double finalAmount = initialCost - discountAmount;
		System.out.println("Total cost after discount: $" + finalAmount);
		
		scan.close(); 
	}

}
