package _3PalindromString;

public class Palindrom {
public static void main(String[] args) {
	System.out.println(Palindrom.isPalindrom("abcba"));
}

private static boolean isPalindrom(String str) {
	
	for(int i=0;i<(str.length()/2);i++) {
	if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
		return false;
	}
	}
	return true;
}
}
