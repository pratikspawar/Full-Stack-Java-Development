package _2Vector;

import java.util.Vector;

public class vectr {
public static void main(String[] args) {
	Vector vect=new Vector();
	vect.addElement(10);
	vect.addElement(20);
	vect.addElement(30);
	
	System.out.println(vect);
//	vect .removeElement(10);
//	System.out.println(vect);
	
//	vect.remove(1);
//	System.out.println(vect);
	
	vect.isEmpty();
	System.out.println(vect.size());
	
	System.out.println(vect.elementAt(1));
	
	vect.remove(0);
	System.out.println(vect);
}
}
