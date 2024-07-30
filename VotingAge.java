package functions;

import java.util.Scanner;

public class VotingAge {
	
	public static int  voting(int age) {
		if(age>=18) {
			System.out.println("You can Vote!");
		}
		else {
			System.out.println("You can't Vote");
		}
		return age;
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Your Age:");
   int age=sc.nextInt();
   System.out.println("------------------------------------------------------------");
   voting(age);
   sc.close();
	}
	

}
