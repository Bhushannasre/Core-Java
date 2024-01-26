//Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3
package Revision;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in) ;
	int n,m,pow;
	System.out.println("Enter n");
	n=sc.nextInt();
	System.out.println("Enter m");
	m=sc.nextInt();
	for(int i=1;i<m;i++) {
		pow=n*i;	
			System.out.println(pow+" ");
			
		
	}
	
	
	
	
	sc.close();
	}

}
