package functions;

import java.util.Scanner;

public class Sumofodd {
	
	public static void sumofodd(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(i%2!=0) {
	   sum=sum+i;
				System.out.print(i+" ");
			}
			
		}
	System.out.println("="+"sum of odd Number is :"+sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
 
 int a=sc.nextInt();
 sumofodd(a);
// System.out.println("sum of n number is :"+sumofodd(a));
 sc.close();
	}

}
