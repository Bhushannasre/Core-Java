package functions;

import java.util.Scanner;

public class Circumference {
	
	public static void circumference(int a) {
		
		double c=2*3.14*a;
		System.out.println("Circumference of circle is :"+c);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the radius");
   int a=sc.nextInt();
   System.out.println("----------------------------------------------------------");
  
circumference(a);
sc.close();
	}

}
