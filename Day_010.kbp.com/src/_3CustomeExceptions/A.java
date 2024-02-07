package _3CustomeExceptions;

public class A {

	public static void main(String[] args) {
		
		try {
			throw new Pratik();
		}
		catch (Pratik e) {
			System.out.println("Excepton handaled!");
		}
//		catch (RuntimeException e) {
//			System.out.println("Excepton handaled!");
//		}catch (Exception e) {
//			System.out.println("Excepton handaled!");
//		}
	}
}
