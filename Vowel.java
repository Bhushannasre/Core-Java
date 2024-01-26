package Revision;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word;
		System.out.println("Enter any word");
		 word=sc.next();
		if(word.contentEquals("a")||word.contentEquals("e")||word.contentEquals("i")||word.contentEquals("o")||word.contentEquals("u")) {
		System.out.println("its a vowel");	
		}
		else {
			System.out.println("its an consonant");
		}
				
sc.close();
	}
	
	

}
