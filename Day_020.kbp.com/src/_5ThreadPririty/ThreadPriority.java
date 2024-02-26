package _5ThreadPririty;

public class ThreadPriority extends Thread {
public static void main(String[] args) {
	ThreadPriority obj1=new ThreadPriority ();
	obj1.setName("Obj1");
	obj1.setPriority(MIN_PRIORITY);
	obj1.start();
	
	ThreadPriority obj2=new ThreadPriority ();
	obj2.setName("Obj2");
	obj2.setPriority(MAX_PRIORITY);
	obj2.start();
}
public void run() {
	System.out.println(Thread.currentThread().getName());
}
}
