package _1LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedLst {
public static void main(String[] args) {
	LinkedList lst=new LinkedList();
	lst.add(100);
	lst.add(300);
	lst.add(200);
	lst.add(400);
	lst.add(500);
//	Random rn=new Random();
//	int index=rn.nextInt(lst.size());
//	System.out.println(lst.get(index));
	
//	Random rm1=new Random();
//	Collections.shuffle(lst,rm1);
//	System.out.println(lst);
	
	Random rm1 =new Random ();
	int index=rm1.nextInt(1000,9999);
	System.out.println(index);
}
}
