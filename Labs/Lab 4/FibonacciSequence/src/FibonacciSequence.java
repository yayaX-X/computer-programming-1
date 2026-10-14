/*
 Author: Nadia Riley
 Title: Lab 4 Programming Assignment (Problem 1)
 Email: rilen01@purdue.edu
 Date: September 28, 2026
 Description: Print the fibonacci sequence based on a number of terms
*/

import java.util.Scanner;
public class FibonacciSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Prompt UI for number of terms
		System.out.print("Enter the number of terms: ");
		int n = scan.nextInt();
		
		
		//Display output
		System.out.print("Fibonacci sequence: ");
		
		// for loop to generate sequence
		int n1 = 0;
		int n2 = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(n1 + " ");
			int nextN = n1 + n2;
			n1 = n2;
			n2 = nextN;
		}
		
		
		scan.close();
	}
}
