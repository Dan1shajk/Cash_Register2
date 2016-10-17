package package1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Inventory {
	public static ArrayList<Product> pList = new ArrayList<Product>();

	public static Product compareProduct(Product p) {

		Product x = null;

		for (int i = 0; i < pList.size(); i++) {
			int inventoryUPC = pList.get(i).getUPC();

			if (inventoryUPC == p.getUPC()) {
				x = pList.get(i);
				return x;
			} else if (i == pList.size() - 1) {
				if (inventoryUPC != p.getUPC()) {
					return null;
				}
			}
		}
		return x;
	}

	public static void addInventory() {
		int upc;
		double price;
		String name;

		// ArrayList<Product> pList = new ArrayList<Product>();

		String fileName = "C:\\Users\\User\\Desktop\\inventory.txt";
		String line = null;
		String delims = "	";

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {

				System.out.println(line);

				String[] tokens = line.split(delims);
				String upcs = tokens[0];
				String names = tokens[1];
				String prices = tokens[2];

				name = names;
				price = Double.parseDouble(prices.substring(1, prices.length()));
				upc = Integer.parseInt(upcs);

				Product p = new Product(upc, name, price);
				pList.add(p);
			}
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
