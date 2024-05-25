package NumberPattern;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) 
	{
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
				
		for(int i=1; i<=num; i++)
		{
			for(int k=1; k<=num-i; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}				

	}

}
