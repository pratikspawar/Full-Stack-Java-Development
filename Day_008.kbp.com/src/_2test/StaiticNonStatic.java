package _2test;

public class StaiticNonStatic {
	public static void m1() {
		System.out.println("Inside Static Block");
	}
	public void m2() {
		System.out.println("Inside Non-Static Block");
	}
	public static void main(String[] args) {
		StaiticNonStatic.m1();//way of staic method call ,by using of classname
		
		StaiticNonStatic obj= new StaiticNonStatic();
		obj.m2();//Way of nonStaic method call,by using object of clas
	}
}
