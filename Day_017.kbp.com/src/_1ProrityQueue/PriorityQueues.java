package _1ProrityQueue;

import java.util.PriorityQueue;

public class PriorityQueues {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add(100);
	pq.offer(200);
	pq.offer(300);
	pq.offer(400);

	System.out.println(pq);
	pq.poll();
	pq.remove();
	System.out.println(pq);
}
}
