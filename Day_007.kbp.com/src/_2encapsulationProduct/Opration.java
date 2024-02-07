package _2encapsulationProduct;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Opration {
     static Appliances ap=new Appliances();
      static Scanner sc =new Scanner(System.in);
	
      public static void setData() {
		System.out.println("Enter Product Id");
		int empId=sc.nextInt();
		ap.setId(empId);
		
		System.out.println("Enter Product name");
		String name=sc.next();
		ap.setName(name);
		
		System.out.println("Enter Product Price");
		float price=sc.nextFloat();
		ap.setPrice(price);
		System.out.println("*************Product Added successfully***************");
	}

	public static void getData() {
		System.out.println("Product Id:"+ap.getId());
		System.out.println("Product name:"+ap.getName());
		float c=ap.getPrice()+ap.getGst();
		System.out.println("Product Price: Rs"+ap.getPrice()+"(Price) + Rs"+ap.getGst()+"(Gst 18%) ="+c);
		
	}

	public static void updateData() {
		
		System.out.println("**********************AP Store*************");
		System.out.println("Press 1 for update Product Id\nPress 2 for update Product name\nPress 3 Update Product Price");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter Product Id");
			int empId=sc.nextInt();
			ap.setId(empId);
			System.out.println("Product Id Update Successfully at:"+LocalDateTime.now());
			break;
			
		case 2:
			System.out.println("Enter Product name");
			String name=sc.next();
			ap.setName(name);
			System.out.println("Product name Update Successfully at:"+LocalDateTime.now());
			break;
			
		case 3:
			System.out.println("Enter Product Price");
			float price=sc.nextFloat();
			ap.setPrice(price);
			System.out.println("Product Price Update Successfully at:"+LocalDateTime.now());
			break;
			
		}
	}

}