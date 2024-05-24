package NumberPattern;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			for(int j=num; j>=i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	}

}
