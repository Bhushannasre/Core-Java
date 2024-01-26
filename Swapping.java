package Revision;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		//Swapping of two numbers
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter value of a ");
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a);
		System.out.println("b="+b);
	sc.close();
	}

}
