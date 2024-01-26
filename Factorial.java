//Write a program to find factorial of a given number. ex:no5  fact=5*4*3*2*1=120
package Revision;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num,fact=1;
	System.out.println("Enter Number");
	num =sc.nextInt();
	
	for(int i=1;i<=num;i++) {
		fact=fact*i;
		
	}
	System.out.println("fact:"+num+"is"+fact);
sc.close();
	}

}
