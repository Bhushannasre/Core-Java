import java.util.Scanner;
public class Test6{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int bs;
double tax,netsal;
System.out.println("Enter BASIC SALARY OF EMPLOYEE");
bs=sc.nextInt();
if(bs<150000){
tax=0;
netsal=tax;
System.out.println("Netsalary is=" +netsal);
}
else if(bs>150000 && bs<=300000){
tax=bs*0.20;
netsal=tax;
System.out.println("Netsalary is=" +netsal);
}
else if(bs>300000){
tax=bs*0.30;
netsal=tax;
System.out.println("Netsalary is=" +netsal);
}
}
}