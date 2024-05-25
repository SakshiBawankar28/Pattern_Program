package NumberPattern;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) 
	{
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
				
		int z= 1;
		for(int i=1; i<=num; i++)
		{
			for(int k=num; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=z; j++)
			{
				System.out.print(j);
				
			}
			z+=2;
			System.out.println();
		}				

	}

}
