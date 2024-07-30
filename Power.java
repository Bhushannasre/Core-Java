package functions;

import java.util.Scanner;

public class Power {
	
	public static void powerr(int a, int b) {
		
			System.out.println(Math.pow(a, b));
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		powerr(a,b);
sc.close();
	}

}
