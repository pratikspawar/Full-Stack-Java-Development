package _6MultiThreadingUsingRannableInterface;

public class MultiThreadingUsingRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cheak");
	}
public static void main(String[] args) {
	MultiThreadingUsingRunnable mtr=new MultiThreadingUsingRunnable();
	Thread th=new Thread(mtr);
	th.start();
	th.start();
}
}
