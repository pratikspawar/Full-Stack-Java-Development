package _7BackShpaceWhenHash;

public class BackSpacaWhenHash {
  public static void main(String[] args) {
	String str="klad#mnc##mcz#";
	System.out.println(BackSpacaWhenHash.BackWhenHash(str));
}

private static String BackWhenHash(String str) {
	String b="";
	for(int i=str.length()-1;i>=0;i--) {
	if (str.charAt(i)=='#'&&str.charAt(i-1)=='#') {
		i-=3;
	}
	 else if(str.charAt(i)=='#') {
			i--;
		}
		else {
			b=str.charAt(i)+b;
		}
	}
	return b;
}
}
