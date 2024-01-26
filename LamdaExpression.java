 package Revision;

public class LamdaExpression {
	public static void main(String[]args) {
  System.out.println("My system starts..");
//	  Myclass myInter = new Myclass();
	//  myInter.sayHello();
  
		/*
		 * Myclass i=new Myclass() {
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("this is first anonoymous class"); } }; i.sayHello();
		 * 
		 * Myclass i2=new Myclass() { public void sayHello() {
		 * System.out.println("this is second anonoymous class"); } }; i2.sayHello();
		 */
  //using our interface with help of Lambda
//  Myclass i= () ->
//	  System.out.println("First time i am using Lamabda expression");
//	  Myclas i=()->
// Myclass i2 = ()-> System.out.print("Second time i am using lambda expression");
//  i2.sayHello();
  
  SumInter sumInter=(a,b)->a+b;
  System.out.println(sumInter.sum(2, 7));
  System.out.println(sumInter.sum (77,8));
  
  LengthInter lengthInter = str -> str.length();       
  System.out.println(lengthInter.getLength("MY Name is Bhushan"));
  
  LengthInter length= str -> str.length();
  System.out.println(lengthInter.getLength("What is your nam!"));
  
  
	}
}
