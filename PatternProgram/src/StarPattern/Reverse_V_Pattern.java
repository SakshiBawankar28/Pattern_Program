package StarPattern;

/*
 * Enter the number : 5
**********
****  ****
***    ***
**      **
*        *
 */

import java.util.Scanner;

public class Reverse_V_Pattern {

	public static void main(String[] args) 
	{
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		// for outer loop
		int i, j;
		for(i=num; i>=1; i--)
		{
			//for right side printing *
			for(j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			//for space
			for(j=1; j<=2*(num-i); j++)
			{
				System.out.print(" ");
			}
			//for left side printing *
			for(j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
