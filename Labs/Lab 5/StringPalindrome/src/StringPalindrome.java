/*
 Author: Nadia Riley
 Title: Lab 5 Programming Assignment (Problem 2)
 Email: rilen01@purdue.edu
 Date: October 14, 2026
 Description: Check if a word is a palindrome.
*/

import java.util.Scanner;
public class StringPalindrome {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Prompt UI
		System.out.print("Enter a word: ");
		String word = scan.next();
		
		// Palindrome check
		String wordReversed = "";
		for (int i = word.length()-1; i >= 0; i--) {
			wordReversed += word.charAt(i);
		}
		
		if (word.equalsIgnoreCase(wordReversed)) {
			System.out.println("The word \"" + word + "\" is a palindrome.");
		} else {
			System.out.println("The word \"" + word + "\" is not a palindrome.");
		}
		
		scan.close();
	}
}
