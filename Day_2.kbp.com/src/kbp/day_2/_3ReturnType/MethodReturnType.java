package kbp.day_2._3ReturnType;



public class MethodReturnType {
	public void  m1() {
		System.out.println("m1");
	}
	public int m2 () {
		return 10000;
	}
	public boolean m3() {
		return true;
	}

	public float m4() {
		return 1.4f;	
	}
	public static void main(String[] args) {
		MethodReturnType obj = new MethodReturnType();
		obj.m1();
		System.out.println(obj.m2());
		System.out.println(obj.m3());
		System.out.println(obj.m4());
	}
}
