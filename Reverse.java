package strings;

public class Reverse {

	public static void main(String[] args) {
	StringBuilder sc=new StringBuilder("Bhushan");
	for(int i=0;i<sc.length()/2;i++) {
		int front=i;
		int back=sc.length()-1-i;
		char frontchar = sc.charAt(front);
		char backchar = sc.charAt(back);
		sc.setCharAt(back, frontchar);
		sc.setCharAt(front, backchar);
	}
	System.out.println(sc);

	}

}
