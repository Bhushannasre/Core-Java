package Revision;

public class ThreadDemo {
	public static void main(String[]args) {
		//First Thread : Thread - JONH
		
		Runnable thread1=()->{
			//this is body of the thread 
			//stuff
			for(int i=1; i<=10;i++) {
				System.out.println("value of i is "+i);
				try {
					Thread.sleep(1000);
					
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		};
		Thread t=new Thread(thread1);
		t.setName("Bhushan");
		t.start();
		
		Runnable t2=()->{
			try {
				for(int i=1;i<=10;i++) {
					System.out.println(i*2);
					Thread.sleep(2000);
				}
			}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		};
		Thread t22= new Thread(t2);
		t22.start();
		
	}

}
