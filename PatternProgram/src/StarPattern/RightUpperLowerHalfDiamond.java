package StarPattern;

/*
 * Enter the number : 5
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
 */

import java.util.Scanner;

public class RightUpperLowerHalfDiamond {

	public static void main(String[] args) {
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		// for upper outer loop
		for (int i = 1; i <= num; i++) {
			// for printing the upper half *
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// outer loop for rows
		for (int i = num; i >= 1; i--) 
		{
			// inner loop for column
			for (int j = 1; j <= i-1; j++) 
			{
				// printing the star pattern
				System.out.print("* ");
			}
			// printing the new line
			System.out.println();
		}
	}

}
