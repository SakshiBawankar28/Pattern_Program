package AlphabetPattern;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		//take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		int num = sc.nextInt();
		char c = 'A';
		
		for (int i =1; i<=num; i++) 
		{
			for (int j=1; j<=num; j++) 
			{
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}

}
