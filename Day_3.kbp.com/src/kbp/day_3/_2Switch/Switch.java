package kbp.day_3._2Switch;

public class Switch {
public static void main(String[] args) {
	int i=1;
	switch (i) {
	case 1: {
		System.out.println("case 1");
		break;
	}
	case 2:{
		System.out.println("case 2");
		break;
	}
	default:
		System.out.println("Default");
	}
	
	//case 1 exicute
	
	i=1;
	switch (2) {
	case 1: {
		System.out.println("case 1");
		break;
	}
	case 2:{
		System.out.println("case 2");
		break;
	}
	default:
		System.out.println("Default");
	}
	//case 2 execute
	
	i=1;
	
	switch (1) {
	case 1: {
		System.out.println("case 1");
		
	}
	case 2:{
		System.out.println("case 2");
		break;
	}
	default:
		System.out.println("Default");
	}
	
	//case 1 and 2 execute
	
	i=1;
	switch (1) {
	case 1: {
		System.out.println("case 1");
		
	}
	case 2:{
		System.out.println("case 2");
	}
	default:
		System.out.println("Default");
	}
	//Execute all
}
}