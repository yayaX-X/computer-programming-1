/*
 Author: Nadia Riley
 Title: Lab 6 Programming Assignment (Problem 1)
 Email: rilen01@purdue.edu
 Date: November 2, 2026
 Description: Validate an account number compared to a list of predefined numbers. 
*/

import java.util.Scanner;
public class AccountNumberValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Create Array
		int[] accountNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555,
				5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 3852085, 7576651,
				7881200, 4581002};
		
		// Prompt UI
		System.out.print("Enter an account number: ");
		int num = scan.nextInt();
		
		// Validation loop
		boolean found = false;
		for(int i = 0; i < accountNumbers.length; i++) {
			if (accountNumbers[i] == num) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Valid account number.");
		} else {	
			System.out.println("Invalid account number.");
		}
		
		
		scan.close();
	}
}
	
