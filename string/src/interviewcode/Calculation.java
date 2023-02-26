package interviewcode;

import java.util.Scanner;

public class Calculation {
	
	public static void main(String[] args) {
		char ch;
	    Double number1, number2, result;

	    Scanner input = new Scanner(System.in);

	    System.out.println("Choose an operator: +, -, *, or /");
	    System.out.println("1. +");
	    System.out.println("2. -");
	    System.out.println("3. *");
	    System.out.println("4. /");

	    System.out.println("Select choice");

	    ch = input.next().charAt(0);

	    System.out.println("Enter first number");
	    number1 = input.nextDouble();
	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (ch) {

	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid choice!");
	        break;
	    }

	    input.close();
	  }
	
		
		
	}


