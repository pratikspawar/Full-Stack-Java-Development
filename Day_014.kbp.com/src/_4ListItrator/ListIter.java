package _4ListItrator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIter {
public static void main(String[] args) {
	ArrayList lst=new ArrayList();
	lst.add(100);
	lst.add(200);
	lst.add(300);
	lst.add(400);
	
	ListIterator itr= lst.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("\n");
	while(itr.hasPrevious()) {
		System.out.println(itr.previous());
	}
}
}
