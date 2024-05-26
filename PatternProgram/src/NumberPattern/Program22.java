package NumberPattern;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) 
	{
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
				
		for(int i=num; i>=i; i--)
		{
			for(int k=1; k<=num-i; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}				

	}

}
