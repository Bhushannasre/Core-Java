import java.util.Scanner;
public class Test3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter value of A");
a=sc.nextInt();
System.out.println("Enter value of B");
b=sc.nextInt();
c=a;
a=b;
b=c;
System.out.println("After Swapping\n"+" a= "+a+" b= "+b);


}
}