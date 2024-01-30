import java.util.Scanner;
public class Test5{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter Number");
num=sc.nextInt();
if(num%5==0 && num%7==0)
System.out.println("It divisible by 5 and 7");
else 
System.out.println("It do not divisible by 5 and 7");

}
}