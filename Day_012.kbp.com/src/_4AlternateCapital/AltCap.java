package _4AlternateCapital;

public class AltCap {
public static void main(String[] args) {
	System.out.println(AltCap.isAlternateCapital("Pratik"));
}

private static String isAlternateCapital(String str) {
	// TODO Auto-generated method stub
	String b1="",b2="";
	for(int i=0;i<str.length();i++) {
		if(i%2==0) {
			b1+=Character.toUpperCase(str.charAt(i));
		}
		else {
			b2+=Character.toLowerCase(str.charAt(i));
		}
	}
	return b1+" "+b2;
}


}//banana -----> true
//amazon ----->true

