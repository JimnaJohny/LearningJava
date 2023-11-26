package arraysJavaWeek3Assignment;

import java.util.Scanner;

public class PhoneBrand {
	String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] apple = { "Iphone12", "Iphone SE", "Iphone 15", "Iphone 13" };
	String brandName;
	int i;
	int flag = 0;
	String product;
	Scanner sc = new Scanner(System.in);

	void productList() {
		System.out.println("Enter the brand of phone you are looking for from the following list: \nSamsung\nGoogle\nApple");
		brandName = sc.nextLine();
		if (brandName.equalsIgnoreCase("Samsung")) {
			System.out.println("Available products of " + brandName + " brand are: ");
			for (i = 0; i < samsung.length; i++) {
				System.out.println(samsung[i]);
			}
			System.out.println("Enter the name of product you want from the above list");
			product = sc.nextLine();
			for (i = 0; i < samsung.length; i++)
				if (samsung[i].equalsIgnoreCase(product)) {
					System.out.println("Product selected is: " + samsung[i]);
					flag = 1;
				}
			if (flag == 0)
				System.out.println("Please select a product from the list");
		} else if (brandName.equalsIgnoreCase("Google")) {
			System.out.println("Available products of " + brandName + " brand are: ");
			for (i = 0; i < google.length; i++) {
				System.out.println(google[i]);
			}
			System.out.println("Enter the name of product you want from the above list");
			product = sc.nextLine();
			for (i = 0; i < google.length; i++)
				if (google[i].equalsIgnoreCase(product)) {
					System.out.println("Product selected is: " + google[i]);
					flag = 1;
				}
			if (flag == 0)
				System.out.println("Please select a product from the list");
		} 
		else if (brandName.equalsIgnoreCase("Apple")) {
			System.out.println("Available products of " + brandName + " brand are: ");
			for (i = 0; i < apple.length; i++) {
				System.out.println(apple[i]);
			}
			System.out.println("Enter the name of product you want from the above list");
			product = sc.nextLine();
			for (i = 0; i < apple.length; i++)
				if (apple[i].equalsIgnoreCase(product)) {
					System.out.println("Product selected is: " + apple[i]);
					flag = 1;
				}
			if (flag == 0)
				System.out.println("Please select a product from the list");
		} else {
			System.out.println("Please enter a brand name from the above list");
		}

	}

}
