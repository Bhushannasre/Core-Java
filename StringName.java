package strings;

public class StringName {

	public static void main(String[] args) {
	StringBuilder sc=new StringBuilder("Bhushan");
	System.out.println(sc);
	
	System.out.println(sc.charAt(4)); //Give the Character of the specific position.
	System.out.println(sc.deleteCharAt(0));// Delete the character at the specific position. 
	System.out.println(sc.append("k"));// Add Character at the end of the words.
	System.out.println(sc.capacity());//Return current capacity. The capacity is the amount of memory available.
	System.out.println(sc.codePointAt(3));//Return the character at the specified index.
	System.out.println(sc.indexOf("s"));// Return index number of specified position.
	System.out.println(sc.length());//Return total length of the sentence or word.
	System.out.println(sc.toString());//Return character in the same sequence.
    sc.setCharAt(0,'M');//Can add the character at the specific place.
    System.out.println(sc);
    System.out.println(sc.capacity());//Return memory capacity.
    System.out.println(sc.substring(1));
    System.out.println(sc.reverse());//Return words in reverse order.
    
    
    
    
	}

}
