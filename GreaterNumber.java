package functions;

import java.util.Scanner;

public class GreaterNumber {
	
	public static void greatestNum(int a, int b) {
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		
		return ;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 System.out.println("----------------------------------------------------");
 greatestNum(a,b);
 sc.close();
	}

}
