package _2StringBulider;

public class StringBulid {
  public static void main(String[] args) {
	
	  StringBuilder sb=new StringBuilder();
	  
	  sb.append("Mumbai");
	  sb.append(false);
	  sb.append("_pune");
	  sb.append("-Delhi");
	  
	  sb.insert(7,true);
	  System.out.println(sb);
}
}
