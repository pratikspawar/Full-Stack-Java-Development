package _4CompiletimePolyInhiritance;

public class Son extends Father {
	public void m1() {
		System.out.println("no Prameter");
	}
	public static void main(String[] args) {
		Son sn=new Son();
		sn.m1();
		sn.m1(10);
	}
}
