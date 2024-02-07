package _5StaticMethodOverriding;

public class Demo {
 public static void m1() {
	 System.out.println("Static with no prameter ");
 }
 public static void m1(int a) {
	 System.out.println("Static with int prameter ");
 }
 public static void main(String[] args) {
	Demo.m1();
	Demo.m1(10);
	
}
}
