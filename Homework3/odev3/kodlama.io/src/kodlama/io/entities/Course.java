package kodlama.io.entities;

public class Course {
	
	private String name;
	private double price;
	public Course(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Course() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
