package _7MyDish;


public class MyDish {
	
	
	  public static boolean feast(String beast, String dish) {
	   boolean b=false;
	   if ((beast.charAt(0)==dish.charAt(0)&&beast.charAt(beast.length()-1)==dish.charAt(dish.length()-1))
			   &&MyDish.checkLetter(beast)&&MyDish.checkLetter(dish)) {
		   b=true;
		
	       }
	   return b; 
	    
	  }
	  

	
private static boolean checkLetter(String str) {
		if(str.length()>=2&&str.charAt(0)!='-'&&str.charAt(str.length()-1)!='-'
				&&str.charAt(0)!=' '&&str.charAt(str.length()-1)!=' '&&MyDish.ChekForNum(str)) {
			return true;
		}
		return false;
	}



private static boolean ChekForNum(String str) {
	for (int i = 0; i < str.length(); i++) {
	    if (Character.isDigit(str.charAt(i))) {
	      return false;
	    }
	  }
	  return true;
}



public static void main(String[] args) {
	System.out.println(MyDish.feast("pizza", "pizza"));
	System.out.println(MyDish.feast("pizza", "pizza "));
	System.out.println(MyDish.feast("heron-", " garlic naan "));
	System.out.println(MyDish.feast("pi123zza", "pizaa"));
	
}
}

