package ExceptionHandling;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Started..");
		try {
		int n1;
		int n2;
		System.out.println("We have got two numbers..");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		int result= n1/n2;
		
	System.out.println("Division is"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("n2 cannot be 0!!");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) { 
			System.out.println("Invalid Numbers!!!");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("ERROR!!");
			System.out.println(e.getMessage());
		}
		finally {
			//always get executed ..
		System.out.println("I am in finally block");
		System.out.println("Closing all resouces...");
		}
	System.out.println("Terminated");
		
	}

}
