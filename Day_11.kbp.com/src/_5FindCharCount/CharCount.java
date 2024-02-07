package _5FindCharCount;


public class CharCount {
	public static void main(String[] args) {
		String a="Hello";
		System.out.println(CharCount.getCharCount(a, 'o'));
		System.out.println(CharCount.getCharCount(a, 'l'));
		System.out.println(CharCount.getCharCount(a, 'z'));
		
	}
public static int getCharCount(String str,char c){
	
    int count = 0;


    for(int i=0;i<str.length();i++) {
    	if(c==str.charAt(i)) {
    		count++;
    	}
    }
    return count;
}
}
