package StarPattern;

import java.util.Scanner;

public class SquareHollowPattern {

	public static void main(String[] args) 
	{
		//take the input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int i, j;
		for (i = 1; i <= n; i++) {
            //  inner loop to handle number of columns
            for (j = 1; j <= n; j++) {
                // star will print only when  it is in first
                // row or last row or first column or last
                // column
                if (i == 1 || j == 1 || i == n 
                    || j == n ) {
                    System.out.print("*");
                }
                // otherwise print space only.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

	}

}
