package _3Product;

import java.util.ArrayList;
import java.util.ListIterator;

public final class Cart {

private ArrayList<Product> lst;
public Cart() {
	this.lst=new ArrayList<Product>();
}
public void addItem(Product pd) {
	lst.add(pd);
}
public void removeItems(Product pd) {
	lst.remove(pd);
}

public  void displayItem() {
	for(Product pd1:lst) {
		System.out.println("Product Id:"+pd1.getId()+"\nProcuct Name:"+pd1.getName()+"\nProduct Price:"+pd1.getPrice()+"\n\n");
	}
}

public void removeItemsName(String str) {
	System.out.println("h1");
	ListIterator<Product> itr= lst.listIterator();
	while(itr.hasNext()) {
		System.out.println("h2");
		Product pd= itr.next();
		if((str.equals(pd.getName() ))) {
			itr.remove();
			System.out.println("h3");
			break;
		}
    }
}

public ArrayList<Product> getProducts() {
    return lst;
}




  


}



