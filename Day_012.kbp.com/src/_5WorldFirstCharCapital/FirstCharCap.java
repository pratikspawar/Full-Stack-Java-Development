package _5WorldFirstCharCapital;

public class FirstCharCap {
public static void main(String[] args) {
	System.out.println(FirstCharCap.firstCarCap("The sun red"));
}

private static String firstCarCap(String str) {
	String b="";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			
			b+=" "+Character.toUpperCase(str.charAt(i+1));
			i++;
		}
		else {
			b+=str.charAt(i);
		}
	}
	return b;
}
}
