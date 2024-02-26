package _4LinkedHashSets;

import java.util.LinkedHashSet;

public class LinkedHashSets {
public static void main(String[] args) {
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	set.add("Pratik");
	set.add("Ashpak");
	set.add("Aman");
	set.add("Sairaj");
	set.add("Pratik");//not Support Duplicates 
	System.out.println(set);
}
}
/*
 hashSet are orderd
 */