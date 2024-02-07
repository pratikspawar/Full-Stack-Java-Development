package _4Product;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OprationShope {
	
    static Appliances ap=new Appliances();
     static Scanner sc =new Scanner(System.in);
	
     public static void setData() {
   	int empId,stock;
   	float price;
   	 while (true) 
   	 {
				 try{
					 System.out.println("Enter Product Id:");
					 empId=sc.nextInt();
					 break;
				 	}
				 catch(Exception e){
					 System.out.println("\n\nPlease enter input of integer  datatype  !!!!!!");
					 sc.nextLine();
				 	}
   	 }
			 ap.setId(empId);
			 
			 while (true) 
	    	 {
					 try{
						 System.out.println("Enter Product Stock:");
						  stock=sc.nextInt();
						 break;
					 	}
					 catch(Exception e){
						 System.out.println("\n\nPlease enter input of integer  datatype  !!!!!!");
						 sc.nextLine();
					 	}
	    	 }
				 ap.setStock(stock);
				
				System.out.println("Enter Product name:");
				String name=sc.next();
				ap.setName(name);
		
		while(true) {
			try {
				System.out.println("Enter Product Price:");
				price=sc.nextFloat();
				break;
			}
			catch(Exception e){
				System.out.println("\n\nPlease enter input of float  datatype  !!!!!");
				sc.nextLine();
			}
		}
				ap.setPrice(price);
			
				
		
				System.out.println("*************Product Added successfully***************");
				 
		 
		
	}

	public static void getData() {
		System.out.println("Product Id:"+ap.getId());
		System.out.println("Product name:"+ap.getName());
		System.out.println("Product Stock:"+ap.getStock());
		float c=ap.getPrice()+ap.getGst();
		System.out.println("Product Price: Rs"+ap.getPrice()+"(Price) + Rs"+ap.getGst()+"(Gst 18%) ="+c);
		
	}

	public static void updateData() {
		
		System.out.println("**********************AP Store*************");
		System.out.println("Press 1 for update Product Id\nPress 2 for update Product name\nPress 3 Update Product Price\nPress 4 for update Stock");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			int empId;
	    	 while (true) 
	    	 {
					 try{
						 System.out.println("Enter Product Id:");
						 empId=sc.nextInt();
						 break;
					 	}
					 catch(Exception e){
						 System.out.println("\n\nPlease enter input of integer  datatype  !!!!!");
						 sc.nextLine();
					 	}
	    	 }
			ap.setId(empId);
			System.out.println("Product Id Update Successfully at:"+LocalDateTime.now());
			break;
			
		case 2:
			System.out.println("Enter Product name:");
			String name=sc.next();
			ap.setName(name);
			System.out.println("Product name Update Successfully at:"+LocalDateTime.now());
			break;
			
		case 3:
			float price;
			while(true) {
			try {
				System.out.println("Enter Product Price:");
				price=sc.nextFloat();
				break;
			}
			catch(Exception e){
				System.out.println("\n\nPlease enter input of float datatype !!!!!!");
				sc.nextLine();
			}
		}
			ap.setPrice(price);
			System.out.println("Product Price Update Successfully at:"+LocalDateTime.now());
			break;
			
		case 4:
			int stock;
			 while (true) 
	    	 {
					 try{
						 System.out.println("Enter Product Stock:");
						  stock=sc.nextInt();
						 break;
					 	}
					 catch(Exception e){
						 System.out.println("\n\nPlease enter input of integer  datatype  !!!!!!");
						 sc.nextLine();
					 	}
	    	 }
				 ap.setStock(stock);
				 break;
			
		}
	}
	
	public static Appliances getObject () {
		return ap;
		}

}

