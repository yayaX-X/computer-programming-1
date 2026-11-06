/*
 Author: Nadia Riley
 Title: Lab 7 Programming Assignment (Problem 1)
 Email: rilen01@purdue.edu
 Date: November 4, 2026
 Description: Create an array based on user input and sort it in ascending order.
*/
import java.util.Scanner;
public class ArraySorting {
	public static int[] sortArray(int[] original) {
		// Create new array
		int x = original.length;
		int[] sorted = new int[x];
		for (int i = 0; i < x; i++ ) {
			sorted[i] = original[i];
		}
		// Sort the new array
		boolean swapped;
		for (int i = 0; i < x - 1; i++) {
			swapped = false;
			for (int j = 0; j < x - i - 1; j++) {
				if(sorted[j] > sorted[j+1]) {
					int temp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
	            break;
	        }
		}
		return sorted;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Create array and prompt UI size
		System.out.print("Enter the size of the array: ");
		int n = scan.nextInt();
		int [] original = new int[n];
		// Prompt user to input array values
		System.out.print("Enter " + n + " integers: ");
		for (int i = 0; i < n; i++) {
			original[i] = scan.nextInt();
		}
		System.out.println();
		// Display original array before sorting
		System.out.print("Array before sorting: [" );
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				System.out.print(original[i]);
			} else {
				System.out.print(original[i] + ", ");
			}
		}
		System.out.println("]");
		// Call array sorting method
		int [] sorted = sortArray(original);
		// Display sorted array
		System.out.print("Array after sorting:  [" );
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				System.out.print(sorted[i]);
			} else {
				System.out.print(sorted[i] + ", ");
			}
		}
		System.out.print("]");
		scan.close();
	}
}
