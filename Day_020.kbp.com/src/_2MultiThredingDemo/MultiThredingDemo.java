package _2MultiThredingDemo;

public class MultiThredingDemo extends Thread{
public static void main(String[] args) throws InterruptedException {
	MultiThredingDemo mt=new MultiThredingDemo();
	mt.start();
	for(int j=0;j<10;j++) {
		System.out.print(" J:"+j);
		Thread.sleep(1000);
	}
}
public  void run() {
	for(int j=0;j<10;j++) {
		System.out.print(" i:"+j);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		System.out.println("Exception occurs");
		}
	}
}
}
