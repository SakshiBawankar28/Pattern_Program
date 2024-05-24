package NumberPattern;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		//for rows
		for(int i=1; i<=num; i++)
		{
			//for columns
			for(int j=1; j<=num; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
