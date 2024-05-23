package StarPattern;

/*
 * Enter the number : 4
****
***
**
*
**
***
****
 */

import java.util.Scanner;

public class K_Pattern {

	public static void main(String[] args) 
	{
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		//for upper outer loop
		for(int i=num; i>=1; i--)
		{
			//for printing *
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			//printing new line
			System.out.println();
		}
		
		//for lower outer loop
		for(int i=2; i<=num; i++)
		{
			//for printing *
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			//printing new line
			System.out.println();
		}

	}

}
