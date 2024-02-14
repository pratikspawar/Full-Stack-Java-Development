package _3Gambling;

public class User {

	private int id;
	private int age;
	private String name;
	private String pass;
	private double bal;
	

	public void setName(String name) {
	this.name=name;
	
	}

	public  void setPassword(String pass) {
	this.pass=pass;
	}

	public int getId() {
		
		return id;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int  getage() {
		// TODO Auto-generated method stub
		return age;
	}

	public String getPass() {
		// TODO Auto-generated method stub
		return pass;
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return bal;
	}

	public void addBalalance(double bal2) {
		// TODO Auto-generated method stub
		this.bal+=bal2;
	}

	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;
	}

}
