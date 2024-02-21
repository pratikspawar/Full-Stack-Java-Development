package _3Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Opration {
	 
	 static Cart cart=new Cart();
	 static ArrayList<Product> lst;
     static Scanner sc =new Scanner(System.in);
	
     public static void setData() {
    	    Product pd=new Product ();
    	    int empId;
    	    float price;
    	    String name;
    	    boolean exists = false;

    	    while (true) {
    	        try {
    	            System.out.println("Enter Product Id:");
    	            empId = sc.nextInt();
    	            // Check if product exists
    	            for (Product p : cart.getProducts()) {
    	                if (p.getId() == empId) {
    	                    System.out.println("Product with this ID already exists.");
    	                    exists = true;
    	                    break;
    	                }
    	            }
    	            if (exists) {
    	                System.out.println("Do you want to update the existing product? (yes/no)");
    	                String choice = sc.next();
    	                if ("yes".equalsIgnoreCase(choice)) {
    	                    // Call update method here if you implement it
    	                    // updateProduct(empId);
    	                }
    	                return; // Exit the method if product exists and user doesn't want to update
    	            }
    	            break;
    	        } catch (Exception e) {
    	            System.out.println("\n\nPlease enter input of integer datatype  !!!!!!");
    	            sc.nextLine();
    	        }
    	    }
    	    
    	    pd.setId(empId);

    	    System.out.println("Enter Product name:");
    	    name = sc.next();
    	    pd.setName(name);

    	    while (true) {
    	        try {
    	            System.out.println("Enter Product Price:");
    	            price = sc.nextFloat();
    	            break;
    	        } catch (Exception e) {
    	            System.out.println("\n\nPlease enter input of float datatype  !!!!!");
    	            sc.nextLine();
    	        }
    	    }
    	    pd.setPrice(price);
    	    cart.addItem(pd);
          
    	    System.out.println("*************Product Added successfully***************\n\n");
    	}


	public static void getData() {
		cart.displayItem();
	}


	public static void deleteData() {
		System.out.println("Enter Product name to delete:");
		String str=sc.next();
		cart.removeItemsName(str);
	}

	
	

}
