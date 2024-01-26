package Revision;
import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
		// Accepting Numbers and check whether it is even or odd
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Number");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		sc.close();
	}
	

}
