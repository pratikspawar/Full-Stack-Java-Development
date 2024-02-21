package _2Voweles;

public class Vowels {
public static void main(String[] args) {
	System.out.println(Vowels.count("aeiou"));
	System.out.println(Vowels.getCounts("Pratik 23424@34"));
}

private static int count(String str) {
	int c=0;
	char v[]= {'a','e','i','o','u','A','E','O','I','O','U'};
	for (int i=0;i<v.length;i++) {
		for(int j=0;j<str.length();j++) {
			if (v[i]==str.charAt(j)) {
				c++;
			}
		}
	}
	
	return c;
}

public static String getCounts(String str) {
	//code
	//abcgsaeojki = vowels : 5 //conaents : 7
	int v=0,c=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
				||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
			
			c++;
		}
//		
		else if (Character.isAlphabetic(str.charAt(i))) {
			v++;
		}
	}
	return "Vowels:"+c+"\nConsonent:"+v;
	

}
}
