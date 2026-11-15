/*
 Author: Nadia Riley
 Title: Lab 8 Programming Assignment (Problem 2)
 Email: rilen01@purdue.edu
 Date: November 15, 2026
 Description: Calculate the distance of a free-falling object based on time and gravity.
*/
public class ObjectFallingDistance {
// Calculation method
	public static double fallingDistance(double t) {
		double d = (1.0/2.0) * 9.8* Math.pow(t, 2);
		return d;
	}
	public static void main(String[] args) {
		// Loop display output
		for(int i = 1; i <= 10; i++) {
			// Call method and print
			if(i < 10) {
				System.out.printf("Time: %ds  Distance: %.2f meters\n", i, fallingDistance(i));
			} else {
				System.out.printf("Time: %ds Distance: %.2f meters\n", i, fallingDistance(i));
			}	
		}	
	}
}
