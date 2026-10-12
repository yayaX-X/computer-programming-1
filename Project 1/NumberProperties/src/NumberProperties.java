/*
 Author: Nadia Riley
 Title: Project 1
 Email: rilen01@purdue.edu
 Date: October 6, 2026
 Description: 
*/

import java.util.Scanner;
public class NumberProperties {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Prompt UI
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		System.out.println("Number: " + n);
		
		
		// Even/odd number check
		if (n%2 == 0) {
			System.out.println("Even/Odd: Even");
		} else {
			System.out.println("Even/Odd: Odd");
		}
		
		
		// Prime number check
		Boolean isPrime = true;
		if (n <= 1) {
			isPrime = false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0)  {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Prime: Yes");
		} else {
			System.out.println("Prime: No");
		}
			
		
		// Calculate square and square root
		System.out.println("Square: " + Math.round(Math.pow(n, 2)));
		if (n < 0) {
			System.out.println("Square Root: " + Math.sqrt(Math.abs(n)) + "i");	
		} else {
			System.out.println("Square Root: " + Math.sqrt(Math.abs(n)));
		}
		
		
		// Calculate sum of digits
		int sum = 0;
		int num = Math.abs(n);
		while (num > 0) {
			sum += num % 10;
			num/= 10;
		}
		System.out.println("Sum of Digits: " + sum);
		
		
		// List all factors
		System.out.print("Factors: ");
		for (int i = 1; i < n; i++) {
			if (n%i == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println(n);
		
		
		// Palindrome Check
		int nReversed = 0;
		int num1 = n;
		while (n > 0) {
			nReversed = nReversed * 10 + n%10;
			n = n / 10;
		}
		if (num1 == nReversed) {
			System.out.println("Palindrome: Yes");
		} else {
			System.out.println("Palindrome: No");
		}
		
		
		scan.close();
	}
}
