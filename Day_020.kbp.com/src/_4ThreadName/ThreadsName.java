package _4ThreadName;

public class ThreadsName extends Thread{
public static void main(String[] args) {
	ThreadsName tn=new ThreadsName();
	tn.start();
	Thread c=Thread.currentThread();
	c.setName("Main Block");
	System.out.println("Name:"+c.getName());
}
public void run() {
	Thread c=Thread.currentThread();
	c.setName("Ashpak");
	System.out.println("Name:"+c.getName());
}
}
