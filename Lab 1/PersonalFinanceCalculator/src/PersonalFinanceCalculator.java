/*
 Author: Nadia Riley
 Title: Lab I Programming Assignment (Problem 2)
 Date: September 1, 2026
 Description: A program that calculates the user's monthly expenses and savings.
*/

import java.util.Scanner;
public class PersonalFinanceCalculator {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Introduction message
		System.out.println("Welcome to the Personal Finance Calculator!");
		System.out.println();
	
		// Prompt user input
		System.out.print("Enter your monthly rent: ");
		int rent = scan.nextInt();
		System.out.print("Enter your monthly utility bills: ");
		int utility = scan.nextInt();
		System.out.print("Enter your monthly grocery expenses: ");
		int grocery = scan.nextInt();
		System.out.print("Enter your monthly income: ");
		int income = scan.nextInt();
		
		// Calculations
		int totalExpense = rent + utility + grocery;
		int savings = income - totalExpense;
	
		// Display output
		System.out.println();
		System.out.println("Your total monthly expense are: $" + totalExpense);
		System.out.println("Your monthly savings are: $" + savings);
		System.out.println("Great job saving money!");
		
		scan.close();
 }
}
