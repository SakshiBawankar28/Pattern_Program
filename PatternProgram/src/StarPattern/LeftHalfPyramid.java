package StarPattern;

/*
 * Enter the number : 4
   *
  **
 ***
****
 */

import java.util.Scanner;

public class LeftHalfPyramid {

	public static void main(String[] args) 
	{
		// take the input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		// outer loop for rows
		for (int i = 1; i<=num; i++) 
		{
			//for sapces
			for(int k=1; k<=num-i; k++)
			{
				System.out.print(" ");
			}
			// inner loop for column
			for (int j = 1; j <= i; j++) 
			{
				// printing the star pattern
				System.out.print("*");
			}
			// printing the new line
			System.out.println();
		}
	}

}
