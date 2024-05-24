package NumberPattern;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) 
	{
		// Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		int number=1;
		//for rows
		for(int i=1; i<=n; i++)
		{
			//for columns
			for(int j=1; j<=n; j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}

	}

}
