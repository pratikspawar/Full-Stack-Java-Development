package _1StringReverces;

public class Reverce {
public static void main(String[] args) {
	System.out.println(Reverce.reverce("Abc"));
}

private static String reverce(String str) {
	String str1="";
	for (int i=str.length()-1;i>=0;i--) {
		str1+=str.charAt(i);
	}
	return str1;
}
}
