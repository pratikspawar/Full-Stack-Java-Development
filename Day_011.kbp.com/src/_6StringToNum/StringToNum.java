package _6StringToNum;


public class StringToNum {
	public static int StringIntoNum(String str ) {
		Integer num = Integer.valueOf(str);
		return num;
	}
	public static void main(String[] args) {
		System.out.println(StringToNum.StringIntoNum("1234"));
		System.out.println(StringToNum.StringIntoNum("605"));
		System.out.println(StringToNum.StringIntoNum("1405"));
		System.out.println(StringToNum.StringIntoNum("-7"));
		
		
		
	}
}
