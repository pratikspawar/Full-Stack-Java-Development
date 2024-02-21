package _4EquleTo;

public class EquleTo {
	public static void main(String[] args) {
		String a="Mubmai";
		String b="Mumai";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		//Same strings store at a loaction which pointing by two variable
		
		String c="Pune";
		String d=new String("Pune");
		System.out.println(c==d);
		System.out.println(c.equals(d));
		//Same String store at diffrent location by two variable
	}
}
