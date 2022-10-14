package Cal_demo;

import java.util.Scanner; 

public class CalDemo {
	
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number(s) here: ");
    int num = in.nextInt();
    	
    
    System.out.println("Which operetion do you want to perform? (sum, sub, div, mul )");
    
    String operator = in.next();
    
    int result = 0;
    int digit, sum = 0;
    int mul = 1;
    int sub = 0;
    int div = 1;
    int num1, num2;
    
   switch (operator) {
   case "sum":
	   do {
		 digit = num % 10;
		 sum = sum + digit;
		 num = num / 10;
	   } while (num > 0);
	   result = sum;
	   break;
   case "sub":
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the first number here : ");
	    num1 = sc.nextInt();
	   System.out.println("Enter the second number here : ");
	    num2 = sc.nextInt();
	   
		 sub = num1 - num2 ;
			
	   
	   result = sub ;
	   break;
   case "div":
	   Scanner sk = new Scanner(System.in);
	   System.out.println("Enter the first number here : ");
	    num1 = sk.nextInt();
	   System.out.println("Enter the second number here : ");
	    num2 = sk.nextInt();
	    
	    div = num1 / num2 ;
	    
	    result = div ;
	   break;
   case "mul":
	   do {
		   digit = num % 10;
			 mul = mul * digit;
			 num = num / 10;
	   }while (num > 0);
	   result = mul ;
	   break;
	   
	default :
		System.out.println("sorry! operator is incorrect");
		
   }
    
   System.out.println( "the answer is" + " " + result ); 
    
	}
}