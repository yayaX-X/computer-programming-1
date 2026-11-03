/*
 Author: Nadia Riley
 Title: Project 2
 Email: rilen01@purdue.edu
 Date: November 2, 2026
 Description: Track the scores of students and display the calculated statistics. 
*/
import java.util.Scanner;
public class StudentPerformanceTracker {
// METHODS
	// Handle UI for array creation
	public static void createArray(Scanner scan, String[] students, int[] scores) {
	    for (int i = 0; i < students.length; i++) {
	        System.out.print("Enter name of student " + (i + 1) + ": ");
	        students[i] = scan.next();
	        System.out.print("Enter score for " + students[i] + ": ");
	        int score = scan.nextInt();
	        // Prompt score validation method
	        while (!scoreValidation(score)) {
	            System.out.print("Score must be an integer between 0 and 100. Try again: ");
	            score = scan.nextInt();
	        }
	        scores[i] = score;
	        System.out.println();
	    }
	}
	// Validate score input
	public static boolean scoreValidation(int x) {
		boolean isValid;
		if (x >= 0 && x <= 100) {
			isValid = true;
		} else {
			isValid = false;
		}
		return isValid;
	}
	// Sort scores and students from lowest to highest
	public static void sortAscending(int [] scores, String[] students) {
		boolean swapped;
		for (int i = 0; i < scores.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < scores.length - i - 1; j++) {
				if(scores[j] > scores[j+1]) {
					int temp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
					String temp2  = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp2;
					swapped = true;
				}
			}
			if (!swapped) {
	            break;
	        }
		}
	}
	// Compute average score
	public static double computeAverage(int[] scores) {
	    double total = 0;
	    for (int i = 0; i < scores.length; i++) {
	        total += scores[i];
	    }
	    return total / scores.length;
	}
	// Compute median score
	public static int computeMedian(int[] scores) {
		int median;
	    int n = scores.length;
	    if (n % 2 == 1) {
	        median = scores[n / 2];
	    } else {
	        median = (scores[n / 2 - 1] + scores[n / 2]) / 2;
	    }
	    return median;
	}
	// Find the highest and lowest score
	public static int scoreHighest(int[] scores) {
		int highestScorer = scores[scores.length-1];
		return highestScorer;
	}
	public static int scoreLowest(int[] scores) {
		int lowestScorer = scores[0];
		return lowestScorer;
	}
	// Determine # of students above and below the average
	public static void scoresAboveAndBelowAvg(int[] scores, double x) {
		int aboveAvg = 0;
		int belowAvg = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > x) {
				aboveAvg++;
			}
			if (scores[i] < x) {
				belowAvg++;
			}
		}
		System.out.println("Number of students above average: " + aboveAvg);
	    System.out.println("Number of students below average: " + belowAvg);
	}
	// Display top scorer(s)
	public static void topScorer(int[] scores, String[] students) {
		int highestScore = scores[scores.length - 1];
		int num = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == highestScore) {
				num ++;
			}
		}
		String [] topScorer = new String[num];
		System.out.print("Top scorer(s): ");
		for (int i = 0 ; i < num; i++) {
			topScorer[i] = students[students.length - num + i];
			if(i == topScorer.length-1) {
				System.out.println(topScorer[i]);
			} else {
				System.out.print(topScorer[i] + ", ");
			}
		}
	}
	// Rank the students from highest to lowest scores
	public static void studentRanking(int[] scores, String[] students) {	 
		boolean swapped;
		for (int i = 0; i < scores.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < scores.length - i - 1; j++) {
				if(scores[j] < scores[j+1]) {
					int temp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
					String temp2  = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp2;
					swapped = true;
				}
			}
			if (!swapped) {
	            break;
	        }
		}
		for (int i = 0; i < students.length; i++) {
			 System.out.println(i + 1 + ". " + students[i] + " - " + scores[i]);
		 }
	}
// MAIN METHOD
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    // Get amount of students
	    System.out.print("Enter number of students: ");
	    int studentSize = scan.nextInt();
	    System.out.println();
	    // Initialize arrays
	    String[] students = new String[studentSize];
	    int[] scores = new int[studentSize];
	    // Call method to create arrays
	    createArray(scan, students, scores);
	    // Sort arrays in ascending order
	    sortAscending(scores, students);
	    // Display output
	    System.out.println("--- Statistics ---");
	    System.out.println();
	    // Call methods and display output
	    System.out.println("Average score: " + computeAverage(scores));
	    System.out.println("Median score: " + computeMedian(scores));
	    System.out.println("Highest score: " + scoreHighest(scores));
	    System.out.println("Lowest score: " + scoreLowest(scores));
	    System.out.println();
	    scoresAboveAndBelowAvg(scores, computeAverage(scores));
	    System.out.println();
	    topScorer(scores, students);
		System.out.println();
	    System.out.println("--- Ranking (High to Low) ---");
	    System.out.println();
	    studentRanking(scores, students);
	    scan.close();
	}
}
