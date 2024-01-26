package Revision;
import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		//Accept number divisible by 5 and 7
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("num=");
		num=sc.nextInt();
		if(num%5==0 && num%7==0) {
		System.out.println("The number is divisible by 5 and 7");
		}
		else {
			System.out.println("The number do not divisible by 5 and 7");
		}
		sc.close();
	}

}
