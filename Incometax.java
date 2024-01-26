package Revision;
import java.util.Scanner;
public class Incometax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Accepting Salary tax according 
		double salary;
		double tax=0;
		double totalsalary;
		
		System.out.println("Enter Salary");
	   salary=sc.nextDouble();
	   if(salary<50000) {
		   System.out.println("No Tax"+salary);
	   }
	   else if (salary <=50000 && salary>=300000) {
		   tax=salary/20*100;
		   totalsalary=salary+tax;
		   System.out.println(totalsalary);
	   }
	   else if (salary>300000)
		   tax=salary/30*100;
	       totalsalary=salary+tax;
		   System.out.println(totalsalary);

		   sc.close();
	}

}
