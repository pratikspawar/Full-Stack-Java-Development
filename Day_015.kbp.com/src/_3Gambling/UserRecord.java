package _3Gambling;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


public class UserRecord {
	
	private ArrayList<User> lst;
	public UserRecord() {
		this.lst=new ArrayList<User>();
	}
	public void addItem(User pd) {
		lst.add(pd);
	}
	public void removeItems(User pd) {
		lst.remove(pd);
	}

	public  void displayItem() {
		for(User pd1:lst) {
			System.out.println("user Id:"+pd1.getId()+"\nUser Name:"+((User) pd1).getName()+"\nUser age:"+pd1.getage()+"\n\n");
		}
	}

	public  void GetLogin() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=sc1.next();
		System.out.println("Enter Your Password:");
		String pass=sc1.next();
		
		ListIterator<User> itr= lst.listIterator();
		while(itr.hasNext()) {
			User pd= itr.next();
			boolean b,c;
			b=name.equals(pd.getName());
			c=pass.equals(pd.getPass());
			System.out.println(b+":"+c);
		
			if(b&&c) {
				System.out.println("------------Login SussesFully------------");
				while(true) {
					System.out.println("\nPress 'Y' for play game:");
					String ch=sc1.next();
					ch.toLowerCase();
					if(ch.equals("y")) {
						if(pd.getBalance()<150) {
							System.out.println("\nYour Acount Balance is low for play Game!!! ");
							System.out.println("Add Minimum "+(150-pd.getBalance())+"Ruppes to Play Game:");
							double bal=sc1.nextDouble();
							pd.addBalalance(bal);
						}
						else {
							pd.addBalalance(-150);
							pd.addBalalance(Game.play());
						}
					}
					else {
						break;
					}
					System.out.println("Yor Net Balance:"+pd.getBalance());
				}
				
			}
			else {
				
				System.out.println("\nYor Entered Wrong Username or Password!!!");
				break;
			}
	    }
	  }
}
