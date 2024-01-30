import java.util.Scanner;
public class Test7{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
char word;
System.out.println("Enter Word");
word=sc.nextchar();
if(word=='a' || word=='e' || word=='i' || word=='o' || word=='u')
System.out.println("Vowel");
else 
System.out.println("Consonant");
}
}

