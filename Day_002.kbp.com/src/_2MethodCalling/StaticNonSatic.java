package _2MethodCalling;


public class StaticNonSatic {
	
		
		public static void m1() {
			System.out.println("inside m2");
		}

		public void m2() {
			System.out.println("inside m1");
		}

		public static void main(String[] args) {
			StaticNonSatic.m1();//Static method call using directly class name
			StaticNonSatic obj=new StaticNonSatic();//nonstatic call using class object 
			obj.m2();
			obj.m1();
		
}
}
