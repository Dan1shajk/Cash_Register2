package package1;

import java.util.ArrayList;

public class Register {
	static Product x = null;
	double total = 0;
	static ArrayList<Product> cart = new ArrayList<Product>();
	
	public static void scanItem() {
		
		
		RegisterScanner scanner = new RegisterScanner();
		x = scanner.scanItem();
		cart.add(x);
		System.out.println(x.getUPC()+ " " + x.getName()+ " $"+x.getPrice());
		
	}
	public static void total(){
		double total = 0;
		
		for(int i= 0; i<cart.size(); i++){
			total = total + cart.get(i).getPrice();
		}
		System.out.println("Total is: "+ total);
	}
	public static void pay(){
		System.out.println("Thanks for shopping");
		for(int i = 0; i <cart.size(); i++)
		{
			System.out.println(cart.get(i).getName()+ " "+cart.get(i).getUPC()+" $"+ cart.get(i).getPrice() );
		}
	}

}
