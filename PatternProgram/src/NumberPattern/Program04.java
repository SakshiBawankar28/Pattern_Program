package NumberPattern;

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) 
	{
		//take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		//fro rows
		for (int i = num; i >= 1; i--) 
		{
			//for colunm
			for (int j = num; j >= 1; j--) 
			{
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}

}
