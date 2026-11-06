/*
 Author: Nadia Riley
 Title: Lab 7 Programming Assignment (Problem 2)
 Email: rilen01@purdue.edu
 Date: November 4, 2026
 Description: Check whether a UI integer is a prime number.
*/
import java.util.Scanner;
public class PrimeNumberCheck {
	public static boolean isPrime(int x) {
		if (x <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(x); i++) {
			if (x % i == 0)  {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		if (isPrime(n)) {
			System.out.print(n + " is a prime number.");
		} else {
			System.out.print(n + " is not a prime number.");
		}
		scan.close();
	}
}
