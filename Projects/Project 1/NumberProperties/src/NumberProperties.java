/*
 Author: Nadia Riley
 Title: Project 1
 Email: rilen01@purdue.edu
 Date: October 6, 2026
 Description: Determine the mathematical properties of an integer.
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
		boolean isPrime = true;
		if (n <= 1) {
			isPrime = false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0)  {
				isPrime = false;
				break;
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
		    System.out.println("Square Root: " + Math.sqrt(-(double) n) + "i");
		} else {
		    System.out.println("Square Root: " + Math.sqrt(n));
		}
		
		
		// Calculate sum of digits
		int sum = 0;
		int num = n;
		while (num != 0) {
		    sum += Math.abs(num % 10);
		    num /= 10;
		}
		System.out.println("Sum of Digits: " + sum);
		
		
		// List all factors
		System.out.print("Factors: ");
		if (n == 0) {
		    System.out.println("All nonzero integers");
		} else {
		    num = Math.abs(n);
		    for (int i = 1; i < num; i++) {
		        if (num % i == 0) {
		            if (i != 1) {
		                System.out.print(", ");
		            }
		            System.out.print(i);
		        }
		    }
		    if (num != 1) {
		        System.out.print(", ");
		    }
		    System.out.println(num);
		}
		
		
		// Palindrome Check
		int num1 = n;
		int nReversed = 0;
		if (n < 0 || (n != 0 && n % 10 == 0)) {
		    System.out.println("Palindrome: No");
		} else {
		    while (num1 > nReversed) {
		        nReversed = nReversed * 10 + num1 % 10;
		        num1 /= 10;
		    }
		    if (num1 == nReversed || num1 == nReversed / 10) {
		        System.out.println("Palindrome: Yes");
		    } else {
		        System.out.println("Palindrome: No");
		    }
		}
		
		
		scan.close();
	}
}
