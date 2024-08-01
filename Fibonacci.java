package functions;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		fibonacci(n);
sc.close();
	}
	public static void fibonacci(int n) {
		
		int a=0; int b=1;
		for(int i=0;i<n;i++) {
		System.out.print(a+" ");
		int next=a+b;
	a=b;
	b=next;
	}
	//	System.out.print(b);
	}
}
