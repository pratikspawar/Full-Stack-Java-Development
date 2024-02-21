package _1StringBuffer;
public class Appliances  {
	 
	private int Id;
	private String name;
	private float price;
	private float gst;
	private int stock;
	
	public void setStock(int stock) {
		this.stock=stock;
	}
	public int getStock() {
		return stock;
	}
	
	
	public void setId(int id) {
		this.Id=id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setPrice(float price) {
		this.price=price;
		this.gst=(price *18)/100;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return Id;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	public float getGst() {
		// TODO Auto-generated method stub
		return gst;
	}
	public void setNewStock(int qyt) {
		this.stock=stock-qyt;
		
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}