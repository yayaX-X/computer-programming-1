/*
 Author: Nadia Riley
 Title: Lab III Programming Assignment (Problem 1)
 Email: rilen01@purdue.edu
 Date: September 23, 2026
 Description: Calculate the sum of all positive nonzero integers up to UI number.
*/

import java.util.Scanner;
public class IntegerSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Prompt UI
		System.out.print("Enter a positive nonzero integer: ");
		int integer = scan.nextInt();
		
		// for loop to calculate sum
		int sum = 0;
		for(int i = 1; i <= integer; i++) {
			sum += i;
		}
		
		// Output Display
		System.out.print("The sum of integers from 1 to " + integer + " is: " + sum);
		
		scan.close();
	}

}
