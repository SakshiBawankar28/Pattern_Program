package AlphabetPattern;

public class Program12 {

	public static void main(String[] args) 
	{
		for (char i ='E'; i>='A'; i--) 
		{
			for(char k=1; k<='E'-i; k++)
			{
				System.out.print(" ");
			}
			for (char j='A'; j<=i; j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
