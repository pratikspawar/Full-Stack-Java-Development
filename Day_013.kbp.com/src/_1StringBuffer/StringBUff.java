package _1StringBuffer;

public class StringBUff {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
	
	sb.append("Mumbai");
	sb.append("-Pune");
	sb.append(10);//AutoBoxing
	
	System.out.println(sb);
	
	sb.insert(013, "-Solapur");
	System.out.println(sb);
	StringBuffer sb1=new StringBuffer();
	sb1.append("-Panadhrpur");
	
	sb.append(sb1);
	System.out.println(sb);
	System.out.println(sb.capacity());
	

	Appliances ap=new Appliances();
	ap.setId(123);
	ap.setName("Pratik");
	ap.setNewStock(15);
	ap.setPrice(100);
	sb.append(ap.toString());
	System.out.println(sb);
}
}
