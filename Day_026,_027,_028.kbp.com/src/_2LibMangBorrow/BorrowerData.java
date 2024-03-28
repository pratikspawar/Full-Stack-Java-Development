package _2LibMangBorrow;

import java.sql.SQLException;
import java.util.Scanner;

public class BorrowerData {
public static void startBorrower() throws SQLException {
	BorroOp br=new BorroOp();
	Scanner sc=new Scanner(System.in);
	boolean b=true;
	while(b) {
	System.out.println("Press 1 for add borrower \nPress 2 for Update borrower\nPress 3 for Delete Borrower\nPress 4 Delete Borrower ");
    int ch=sc.nextInt();
    switch(ch){
    case 1:
    	br.addBorrower();
    	break;
    case 2:
    	br.updateBorrower();
    	break;
    case 3 :
    	br.deleteBorrower();
    	break;
    case 4:
    	br.displayBorrower();
    	break;
    case 5:
    	b=false;
    	break;
    }
	}
	}


}
