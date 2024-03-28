package _1LibMangBook;

import java.sql.SQLException;
import java.util.Scanner;

import _2LibMangBorrow.BorroOp;
import _2LibMangBorrow.BorrowerData;
import _2LibMangBorrow.BorrowerOpration;



public class Home {
	
		public static void main(String[] args) throws SQLException {
			boolean b=true;
			while(b) {
				System.out.println("********KBPCOES LIBRARY**********");
				System.out.println("Press 1 Book Opration\nPress 2 Borrower Opration\nPress 3 For Issue Book \nPress 4 For For Submit Book\nPress 5 For Reset All Data\nPress 6 For Exit");
				Scanner sc=new Scanner(System.in);
				switch(sc.nextInt()) {
				case 1:
					Opration.bookOP();
					break;
				case 2:
						BorrowerData.startBorrower();
					
					break;
					
				case 3:
					BorrowerOpration.checkBorrow();
					break;
				case 4:
					
					BorrowerOpration.SubmiteBook();
					
					break;
				case 5:
					MyDatabase.removeAllData();
				    break;
				case 6:
					b=false;
					break;
				
			}
		}
		}
}
