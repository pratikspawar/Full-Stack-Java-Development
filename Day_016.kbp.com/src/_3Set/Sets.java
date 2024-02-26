package _3Set;

import java.util.HashSet;

public class Sets {
public static void main(String[] args) {
	HashSet set=new HashSet();
	set.add(100);
	set.add(200);
	set.add(300);
	set.add(400);
	set.add(null);
	set.add(null);//not supprt duplicate null
	set.add(100);//not support duplicate value
	System.out.println(set);
	set.remove(100);
	System.out.println(set);
	System.out.println(set.isEmpty());
	System.out.println(set.toArray());
	System.out.println(set.contains(100));
	set.clear();
	System.out.println(set);
	
}
}
/*
 -unorderd
 -not support null value
 */