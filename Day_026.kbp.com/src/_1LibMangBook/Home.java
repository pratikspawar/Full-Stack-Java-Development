package _1LibMangBook;

import java.util.Scanner;

import _2LibMangBorrow.BorroOp;



public class Home {
	
		public static void main(String[] args) {
			boolean b=true;
			while(b) {
				System.out.println("********KBPCOES LIBRARY**********");
				System.out.println("Press 1 For Add Book\nPress 2 For Add Borrowere\nPress 3 For Exit");
				Scanner sc=new Scanner(System.in);
				switch(sc.nextInt()) {
				case 1:
					Opration.SetBook();
					break;
				case 2:
					BorroOp.checkBorrow();
					break;
				case 3:
					BorroOp.SubmiteBook();
					b=false;
					break;
				
			}
		}
		}
}
