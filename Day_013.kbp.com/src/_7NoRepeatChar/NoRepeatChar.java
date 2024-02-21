package _7NoRepeatChar;

public class NoRepeatChar {
	public static void main(String[] args) {
	   System.out.println(NoRepeatChar.noRepeat("geeksforgeeks"));
	   System.out.println(NoRepeatChar.noRepeat("Abc"));
	  }

	private static boolean noRepeat(String str) {
		str=str.toLowerCase();
		// TODO Auto-generated method stub
		 int[] count = new int[256];
		    for (int i = 0; i < str.length(); i++) {
		      count[str.charAt(i)]++;
		    }
		    for (int i = 0; i < str.length(); i++) {
		      if (count[str.charAt(i)] != 1) {
		        return false;
		      }
		    }
		return true;
	}
	
}
