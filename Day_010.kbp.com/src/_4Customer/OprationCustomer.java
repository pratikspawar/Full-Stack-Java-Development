package _4Customer;

import java.util.Scanner;

import _4Product.*;

public class OprationCustomer {
	static Appliances ap= OprationShope.getObject();
	static Customer cm=new Customer();
	
    public static void setCustomer() {
	 Scanner sc=new Scanner(System.in);
	 
	 int id;
	 while(true) {
		 
		 try {
			  System.out.println("Enter Customer Id:");
			  id =sc.nextInt();
			  break;
		  }
		 catch(Exception e){
			  System.out.println("\n\nPlease enter input of integer  datatype  !!!!!!");
			  sc.nextLine();
			  }
	      }
	 cm.setId(id);
	 
	 System.out.println("Enter Customer Name:");
	 String name =sc.next();
	 cm.setName(name);
	 
	 int qyt;
	 while(true) {
		 
		 try {
			 System.out.println("Enter Customer required Quantity:");
			 qyt =sc.nextInt();
			 break;
		 }
		 catch(Exception e) {
			 System.out.println("\n\\nPlease enter input of integer  datatype  !!!!!!");
			 sc.nextLine();
		 }}
	 cm.setQyt(qyt);
	 
	 double amt;
	 while(true) {
		 
		 try {
			 System.out.println("Enter Customer Amt:");
			 amt=sc.nextInt();
			 break;
		 }
		 catch(Exception e) {
			 System.out.println("\n\nPlease enter input of dobule  datatype  !!!!!!");
			 sc.nextLine();
			 }
	 }
	 cm.setAmt(amt);
	 
	 
	 
 }

    public static void get_billing() {
    	OprationCustomer.GetStock(ap.getStock(),cm.getQyt());
    	
         System.out.println("********************Billing************************\n\n");
         System.out.println("Customer Id:"+cm.getId());
         System.out.println("Customer Name:"+cm.getName());
         System.out.println("Product Id:"+ap.getId());
         System.out.println("Product Name:"+ap.getName());
         
         
   	 
         double c=ap.getPrice()+ap.getGst();
         cm.setToatalAmaount(c);
         
         System.out.println("Total amount: "+cm.getTotalAmaount());
         System.out.println("Amount given You:"+cm.getAmountByCustomer());
         System.out.println("Change:"+cm.getChange());
         System.out.println("\n\n********************Thank You,visit Again***************");
         System.out.println("Remaing Stock:"+(ap.getStock()-cm.getQyt()));
     
    }   
    
	private static void GetStock(int stock,int qyt) {
		Scanner sc=new Scanner(System.in);
		
		if (qyt>stock) {
			System.out.println("Sorry only  "+(qyt-stock)+" products are less than your required quantity !!\n");
			
			int qyt1;
			while(true) {
					try {
						 System.out.println("Please Enter new quantity for product which are less than or equal to "+stock+":");
						 qyt1 =sc.nextInt();
						 break;
					}
					catch(Exception e) {
						System.out.println("\n\nPlease enter input of integer  datatype  !!!!!!");
					    sc.nextLine();
						}
				}
		     cm.setQyt(qyt1);
			
		}
		
	}

	
 
}

