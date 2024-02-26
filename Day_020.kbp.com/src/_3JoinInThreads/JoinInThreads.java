package _3JoinInThreads;

import java.util.Scanner;

public class JoinInThreads extends Thread {
static int sum,n;
public static void main(String[] args) throws InterruptedException {
	long startTime=System.currentTimeMillis();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no :");
	JoinInThreads.n=sc.nextInt();
	JoinInThreads jt=new JoinInThreads();
	jt.start();
	jt.join();
	System.out.println("sum:"+JoinInThreads.sum);
	long endTime=System.currentTimeMillis();
	System.out.println("Total Time Requrired:"+(endTime-startTime)/1000);
}
public void run() {
	for(int i=0;i<=JoinInThreads.n;i++) {
		JoinInThreads.sum+=i;
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
