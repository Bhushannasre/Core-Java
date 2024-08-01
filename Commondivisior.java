package functions;

import java.util.Scanner;

public class Commondivisior {
	
	public static void commanNumber(int a, int b, int num) {
		if(a%num==0 && b%num==0) {
			
			System.out.println("The Greatest Comman Divisior is:"+num);
		}
		else {
			System.out.println("It's not a Comman Divisior Number");
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int num=sc.nextInt();
		commanNumber(a,b,num);
		
sc.close();
	}

}
