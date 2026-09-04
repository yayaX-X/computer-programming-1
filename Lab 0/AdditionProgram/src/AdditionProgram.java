/* 
Name: Nadia Riley
PFW Email: rilen01@pfw.edu
Date: 08/24/2026
Program Name: AdditionProgram
Description: Calculate and display the sum of two integers.
*/ 

import java.util.Scanner;
public class AdditionProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Get first user input 
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		// Get second user input 
		System.out.println("Enter the second number: ");
		int num2 = scan.nextInt();
		
		// Calculate the sum
		int sum = num1 + num2;
		
		// Display the output
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
		scan.close();

	}

}
