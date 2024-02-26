package _2ArrayDequeue;

import java.util.ArrayDeque;

public class ArrayDeQueues {
public static void main(String[] args) {
	ArrayDeque adq=new ArrayDeque();
	
	adq.add(100);
	adq.add(200);
	adq.add(400);
	adq.add(400);
	System.out.println(adq);
	adq.addFirst(50);
	System.out.println(adq);
	adq.addLast(100);
	System.out.println(adq);
	adq.removeFirst();
	System.out.println(adq);
	adq.removeLast();
	System.out.println(adq);
	
}
}
