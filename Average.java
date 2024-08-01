package functions;

import java.util.Scanner;

public class Average {

	public static int averageNum(int a, int b, int c) {
		int avg=a+b+c;
		int total=avg/2;
		System.out.println(total);
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
       int total=averageNum(a, b, c);
      System.out.println("Average of 3 Number is :"+total);
      sc.close();
	}

}
