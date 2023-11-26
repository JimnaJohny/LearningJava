package arraysExamples;

import java.util.Scanner;

public class Products {

	String[] products = { "Laptop", "Phone", "Powerbank", "Headphones", "Earphones", "Mouse", "Charger", "LaptopStands",
			"Keyboard", "HDMI cable" };
	Scanner sc = new Scanner(System.in);

	void findProductExists() {

		System.out.println("Enter the first product you want to buy");
		String item1 = sc.next();
		System.out.println("Enter the second product you want to buy");
		String item2 = sc.next();
		int flag = 0;

		// Iterate over the array
		for (int i = 0; i < products.length; i++)
			if (products[i].equalsIgnoreCase(item1)) {
				System.out.println("Found " + item1 + " in the product list");
				flag = 1;
				break;
			}
		for (int i = 0; i < products.length; i++)
			if (products[i].equalsIgnoreCase(item2)) {
				System.out.println("Found " + item2 + " in the product list");
				flag = 2;
				break;
			}
		if (flag == 0)
			System.out.println("Items are not found in the product list");
	}

}
