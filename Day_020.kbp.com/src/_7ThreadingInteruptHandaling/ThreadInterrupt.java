package _7ThreadingInteruptHandaling;

public class ThreadInterrupt extends Thread {
public static void main(String[] args) throws InterruptedException {
	ThreadInterrupt thi=new ThreadInterrupt();
	thi.start();
	Thread.sleep(6000);
	thi.interrupt();
	
}
public void run() {
	try {
	for(int i=0;i<=10;i++) {
		System.out.println(i);
		
			Thread.sleep(1000);
		}
	}
	 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Interput Handaled");
		}
}
}
