//Part 1 : Write a program which when given a phone brand name, shows all the available products present in that category. Please use the below table to create list of products for each category.
//Part 2:  After displaying all the available products, ask user to enter one product name.  
//Ensure user enters one of the displayed names.
// If user enters a name which is present in list, print  “product selected is : name of product “ 
// otherwise display an error message – “Please select a product from the list”
//
//Samsung	Google	Apple
//S20	Google Pixel 6	Iphone12
//S21	Google Pixel 6 Pro 	Iphone SE
//Flip3	Google Pixel Pro	Iphone 15
//Fold3	Google  Pixel 5	Iphone 13

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
		while(flag==0) {
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
				System.out.println("Invalid Product name");
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
				System.out.println("Invalid Product name");
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
				System.out.println("Inavlid Product name");
		} else {
			System.out.println("Invalid brand name");
		}
		}

	}

}
