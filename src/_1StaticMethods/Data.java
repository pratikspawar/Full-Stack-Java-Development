package _1StaticMethods;


	public class Data {
		// static block run first when static and main block belongs to same class
			
			public static void main(String[] args) {
				System.out.println("inside main bock");
			}
			static {
				System.out.println("inside static block");
			}
	}

