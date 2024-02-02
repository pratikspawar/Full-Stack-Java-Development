package kbp.day_5._3CompiletimePolyMorphisam;




public class First {
		public void m1() {
			System.out.println("No Prameter ");
		}
		public void m1(int a) {
			System.out.println("Prameter with int");
		}
		public void m1(String a) {
			System.out.println("Prameter with String");
		}
		public void m1(String a,String b) {
			System.out.println("Prameter with Two String");
		}
			public static void main(String[] args) {
				First ft=new First();
				ft.m1();
				ft.m1(6);
				ft.m1("Kbp");
				ft.m1("pratik", "Pawar");
			}
		}
	/* Compile time polymorphisam/Method ovrloding
	 -not requied inhiritance,but we can achive through in inhitance
	 -it reuired method with different prameter type or number of prameter
	*/

