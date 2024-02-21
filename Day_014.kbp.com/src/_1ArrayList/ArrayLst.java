package _1ArrayList;

import java.util.ArrayList;

public class ArrayLst {
public static void main(String[] args) {
	
	ArrayList lst=new ArrayList();
	lst.add(100);
	lst.add(80);
	for(int i=0;i<10;i++) {
		lst.add(i);
	}
	
	lst.add("Pratik");
	System.out.println(lst);
}
}
