/*
 Author: Nadia Riley
 Title: Lab 6 Programming Assignment (Problem 2)
 Email: rilen01@purdue.edu
 Date: November 2, 2026
 Description: Creating a usre-defined array and listing the statistics of elements. 
*/

import java.util.Scanner;
public class ElementStats {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Prompt UI
		System.out.print("Enter the number of elements: ");
		int size = scan.nextInt();
		
		// Assign size to array
		double[] numbers = new double[size];
		
		// Loop array elements
		System.out.print("Enter " + size + " numbers: ");
		for(int i = 0; i < size; i++) {
			numbers[i] = scan.nextDouble();
		}
		
		// Find smallest and largest number
		double smallest = numbers[0];
		double largest = numbers[0];
		for (int i = 1; i < size; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);
		
		// Calculate average and sum
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += numbers[i];
		}
		double average = sum / size;
		
		System.out.println("Average: " + average);
		System.out.println("Total: " + sum);
		
		
		scan.close();
	}
}