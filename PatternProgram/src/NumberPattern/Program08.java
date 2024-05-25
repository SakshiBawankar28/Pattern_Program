package NumberPattern;

import java.util.Scanner;

public class Program08 {

	public static void main(String[] args) {
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		for(int i=num; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
	}

}
