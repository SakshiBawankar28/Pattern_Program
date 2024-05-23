package StarPattern;

/*
 * Enter the number : 5
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
 */

import java.util.Scanner;

public class LeftUpperLowerHalfDiamond {

	public static void main(String[] args) {
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		//for upper outer loop
		for(int i=1; i<=num; i++)
		{
			//for printing the space
			for(int k=1; k<=num-i; k++)
			{
				System.out.print(" ");
			}
			//for printing the upper half *
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//for lower outer loop
		for(int i=num; i>=1; i--)
		{
			//for printing the spaces
			for(int k=0; k<=num-i; k++)
			{
				System.out.print(" ");
			}
			//for printing the lower half *
			for(int j=1; j<=i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
