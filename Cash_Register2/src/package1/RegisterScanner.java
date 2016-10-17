package package1;

import java.util.Scanner;

public class RegisterScanner {

	public static Product scanItem() {

		Product x = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter product UPC");
		try {
			int upc = scan.nextInt();
			Product p = new Product(upc);
			Inventory i = new Inventory();
			//try {
				x = i.compareProduct(p);
				if (x == null) {
					//throw new Exception();
					System.out.println("Product not found");
				}
				
				

			//} catch (Exception e) {
			//	System.out.println("ITTem not found");
			//}

		} catch (Exception e) {
			System.out.println("Invalid UPC, must be on type int");
		}
		return x;

	}

}
