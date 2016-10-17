package package1;

public class Product {
	private int UPC;
	private String name;
	private double price;
	
	Product(int u, String n, double p){
		UPC = u;
		name = n;
		price = p;
	}
	Product (int u){
		UPC = u;
		name = "null ";
		price = 0;
	}
	public String toString(){
		String s;
		s = UPC +" " + name + " " + price;
		return s;
		
	}
	public int getUPC(){
		return UPC;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}

}
