package _2Casino;

import java.util.ArrayList;
import java.util.Random;

public class Casino {
public static void main(String[] args) {
	ArrayList arr=new ArrayList();
	arr.add("Tv");
	arr.add("AC");
	arr.add("Moblie");
	arr.add("Better Luck Next Time");
	
	Random rn=new Random();
	int index=rn.nextInt(arr.size());
	System.out.println(arr.get(index));
			}
}
