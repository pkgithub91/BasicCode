package practices.max;

import java.util.Scanner;

public class CountWord {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 1;
		for(int i=0; i<s.length()-1; i++)
		{
			
			if((s.charAt(i)==0) && (s.charAt(i+1)!=0))
			{
				count++;
			}
			
		}
		System.out.println(count);
		
		
		
	}

}
