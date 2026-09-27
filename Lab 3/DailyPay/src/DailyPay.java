/*
 Author: Nadia Riley
 Title: Lab III Programming Assignment (Problem 2)
 Email: rilen01@purdue.edu
 Date: September 24, 2026
 Description: Calculate the total earnings over a given amount of days
*/

import java.util.Scanner;
public class DailyPay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Prompt UI for days worked
		System.out.print("Enter the number of days worked: ");
		int days = scan.nextInt();
		
		// for loop to calculate daily pay
		double pay = 0.00;
		double rounded = 0.00;
		for (int i = 1; i <= days ; i++) {
			pay += 0.01 * Math.pow(2, i - 1);
			rounded = Math.round(pay * 100.0) / 100.0;
			
			// Display output
			System.out.println("Day " + i + " earning = $" + rounded);
		}
		System.out.println(" ");
		System.out.println("Total pay after " + days + " days = $" + rounded);
		
		scan.close();
	}

}
