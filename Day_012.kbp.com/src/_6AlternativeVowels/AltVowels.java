package _6AlternativeVowels;

import java.util.Iterator;

public class AltVowels {

private static boolean alternateVowels(String str) {
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') ){
				return false;
		       
			}
		}
		return true;
  }
	public static void main(String[] args) {
		String str="Banana",b1="",b2="";
		boolean b;
	    for(int i=0;i<str.length();i++) {
	    	if(i%2==0) {
	    		b1+=Character.toLowerCase(str.charAt(i));
	    	}
	    	else {
				b2+=Character.toLowerCase(str.charAt(i));
			}
	    }
	    if(AltVowels.alternateVowels(b1)||AltVowels.alternateVowels(b2)) {
	    	b=true;
	    }
	    else {
	    	b=false;
	    }
	    System.out.println(b);
	}

}
