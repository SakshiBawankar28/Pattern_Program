package AlphabetPattern;

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		//take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		int num = sc.nextInt();
		char c = 'A';
		
		for (int i=num; i>=1; i--) 
		{
			for (int j=1; j<=i; j++) 
			{
				System.out.print(c + " ");
			}
			c++;
			System.out.println();
		}
	}

}