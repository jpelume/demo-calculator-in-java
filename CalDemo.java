package Cal_demo;

import java.util.Scanner; 

public class CalDemo {

	public static void main(String[] args) {
		int num1, num2 ;
		//in oreder to take input from user we have to create scanner object
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		
		num1 = in.nextInt();
		
		System.out.println("Enter the second number: ");
		
		num2 = in.nextInt();
		
		System.out.println("Sum = "+(num1+num2));
		System.out.println("Subtraction = "+(num1-num2));
		System.out.println("Multiplication = "+(num1*num2));
        System.out.println("Division = "+(num1/num2));

		
		

	}

}
