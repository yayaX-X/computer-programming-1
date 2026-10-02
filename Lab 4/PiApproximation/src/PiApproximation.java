/*
 Author: Nadia Riley
 Title: Lab 4 Programming Assignment (Problem 2)
 Email: rilen01@purdue.edu
 Date: September 28, 2026
 Description: Approximate the value of pi based on a number of terms
*/

import java.util.Scanner;
public class PiApproximation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Prompt UI
		System.out.print("Input: ");
		int n = scan.nextInt();
		
		// for loop for Leibniz formula
		double sum = 0;
		for(int i=0; i<n; i++) {
			double d = (2 * i) + 1;
			double term = 1 / d;
			if(i%2 == 0) {
				sum += term;
			} 
			else {
				sum -= term;
			}	
		}
		double pi = sum * 4;
		System.out.println("Approximated value of Pi: " + pi);
		
		scan.close();
	}
}
