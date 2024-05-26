package NumberPattern;

import java.util.Scanner;

public class Program20 {

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
			for(int j=0; j<z; j++)
			{
				System.out.print(z-j);
				
			}
			z+=2;
			System.out.println();
		}				

	}

}
