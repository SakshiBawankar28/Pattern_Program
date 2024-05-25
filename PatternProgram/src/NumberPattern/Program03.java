package NumberPattern;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		// Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		//for rows
		for(int i=num; i>=1; i--)
		{
			//for columns
			for(int j=1; j<=num; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
