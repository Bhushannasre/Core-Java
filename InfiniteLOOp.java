package functions;

import java.util.Scanner;

public class InfiniteLOOp {
 int i=0;
	
	public static void infite(int in) {
		do {
			System.out.println("Congratulations Bhushan Vijay Nasre You are finally Placed! Best of luck!");
		}
		while(in<=100) ;
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	   int in=sc.nextInt();
	   infite(in);
sc.close();
	}

}
