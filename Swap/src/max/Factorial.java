package max;

import java.util.Scanner;

public class Factorial {
	
	
	/*public static int factorial(int n)
	{
		//int nextInt = sc.nextInt();
		if(n==1)
		{
			return 1;
		}
		else {
			return(n*factorial(n-1));
		}
	}*/

	public static void main(String[] args) {
		
		//System.out.println(Factorial.factorial(5));
		
		System.out.println("Enter the Number:");
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		
		int factorial=1;
		
		for(int i=1; i<=n;i++)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
		
	}

}
