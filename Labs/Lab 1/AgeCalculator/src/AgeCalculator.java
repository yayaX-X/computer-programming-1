/*
 Author: Nadia Riley
 Title: Lab I Programming Assignment (Problem 1)
 Date: September 1, 2026
 Description: A program that calculates the user's future ages.
*/

import java.util.Scanner;
public class AgeCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Welcome message
		System.out.println("Hi there, welcome to Lab 1!");
		System.out.println();
		
		// Age input
		System.out.print("How old are you? ");
		int age = scan.nextInt();
		
		// Travel input
		System.out.print("How far in the future would you like to travel?(in years) ");
		int travel = scan.nextInt();
		
		// Calculations
		int ageafter10 = age + 10;
		int ageafter20 = age + 20;
		int ageafter40 = age + 40;
		int ageaftertravel = age + travel;

		// Display output
		System.out.println();
		System.out.println("In 10 years you will be " + ageafter10 + " years old.");
		System.out.println("In 20 years you will be " + ageafter20 + " years old.");
		System.out.println("In 40 years you will be " + ageafter40 + " years old.");
		System.out.println("If you travel " + travel + " years into the future, you will be " + ageaftertravel + "  years old.");

		scan.close();

	}

}
