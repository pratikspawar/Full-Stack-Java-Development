package _4inhiritance;

public class X {
	public String pb="Public";
	String df="Default";
	private String pv="private";
	protected String pt="protected";
	public static void main(String[] args) {
		X s=new X();
		System.out.println(s.pb);
		System.out.println(s.df);
		System.out.println(s.pv);
		System.out.println(s.pt);
	}
}
