/*
 Author: Nadia Riley
 Title: Lab 5 Programming Assignment (Problem 1)
 Email: rilen01@purdue.edu
 Date: October 14, 2026
 Description: Manipulate the contents of word.
*/

import java.util.Scanner;
public class StringManipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Prompt UI
		System.out.print("Enter a word: ");
		String word = scan.next();
		
		// Convert to uppercase
		System.out.println("Uppercase: " + word.toUpperCase());
		
		// Convert to lowercase
		System.out.println("Lowercase: " + word.toLowerCase());
		
		// Display length
		System.out.println("Length: " + word.length());
		
		// Display first and last letter
		System.out.println("First character: " + word.charAt(0));
		System.out.println("Last character: " + word.charAt(word.length()-1));
		
		scan.close();
	}

}
