package _6OverridingofConstuctor;

public class First {
  First(){
	  System.out.println("no argument");
  }
  First(int a){
	  System.out.println("With int argumnet");
  }
  First(String a){
	  System.out.println("With String argumnet");
  }
  public static void main(String[] args) {
    First fb1=new First();
	First fb2=new First(10);
	First fb3=new First("kbp");
		
}
}
