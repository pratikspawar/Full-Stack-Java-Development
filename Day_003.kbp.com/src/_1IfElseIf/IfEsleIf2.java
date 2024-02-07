package _1IfElseIf;

public class IfEsleIf2 {
	public static void main(String[] args) {
		int i=10;
		if (i++==10) {
			System.out.println("Inside if");
		}
		else if(i<30) {
			System.out.println("Inside else if");
		}
		else {
			System.out.println("Inside if");
		}
        //assign first the increment
		
		
		i=10;
		if (++i==10) {
			System.out.println("Inside if");
		}
		else if(i<30) {
			System.out.println("Inside else if");
		}
		else {
			System.out.println("Inside if");
		}
		
		// increment first and then assign
		i=10;
		if (true) {
			System.out.println("Inside if");
		}
		else if(true) {
			System.out.println("Inside else if");
		}
		else {
			System.out.println("Inside if");
		}

		// if first true then ignoor remaning
		i=1000;
		if (false) {
			System.out.println("Inside if");
		}
		else if(((i=29)<30)) {
			System.out.println("Inside else if");
		}
		else {
			System.out.println("Inside if");
		}
		//
	}
}
