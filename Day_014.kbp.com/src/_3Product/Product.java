package _3Product;

public class Product {
private int id;
private String name;
private double price ;
public Product(int id,String name,double price) {
	super();
	this.id=id;
	this.name=name;
	this.price=price;
}

public Product() {
	
}
public void setId(int id) {
	this.id=id;
}
public int getId() {
	return id;
}

public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}

public void setPrice(double price) {
	this.price=price;
}
public double getPrice() {
	return  price;
}
}
