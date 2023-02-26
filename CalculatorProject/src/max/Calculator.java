package max;

import java.util.Scanner;

public class Calculator {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int f = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int s = sc.nextInt();
		System.out.println("+,*,/,-");
		
		String sym = sc.next();
		int rev;
		
		switch (sym) {
		case "+":rev=f+s;
		{
			System.out.println("Addition:"+rev);
			break;
		}
		case "-":rev=f-s;
		{
			System.out.println("substration:"+rev);
			break;
		}
		
		case "/":rev=f/s;
		{
			System.out.println("Division:"+rev);
			break;
		}
		
		case "*":rev=f*s;
		{
			System.out.println("Multiplication:"+rev);
			break;
		}
		
		default:
			System.out.println("Invelid Number for Calculation:Sorry......");
			break;
			
		}
		
		
		
		
		
	}

}
