package javaWeek3;

import java.util.Scanner;

public class PizzaMethod {
	int price;
	String topping;
	String cheese;
	Scanner sc = new Scanner(System.in);

	void printBill(String size) {
		switch (size) {
		case "Small":
			price = price + 15;
			System.out.println("Do you need extra pepperoni topping? Y/N");
			String topping = sc.nextLine();
			if (topping.equals("Y"))
				price = price + 2;
			System.out.println("Do you need extra cheese?");
			cheese = sc.nextLine();
			if (cheese.equals("Y"))
				price = price + 1;
			System.out.println("Your final bill is $" + price);
			break;
		case "Medium":
			price = price + 20;
			System.out.println("Do you need extra pepperoni topping? Y/N");
			topping = sc.nextLine();
			if (topping.equals("Y"))
				price = price + 3;
			System.out.println("Do you need extra cheese?");
			cheese = sc.nextLine();
			if (cheese.equals("Y"))
				price = price + 1;
			System.out.println("Your final bill is $" + price);
			break;
		case "Large":
			price = price + 25;
			System.out.println("Do you need extra pepperoni topping? Y/N");
			topping = sc.nextLine();
			if (topping.equals("Y"))
				price = price + 3;
			System.out.println("Do you need extra cheese?");
			cheese = sc.nextLine();
			if (cheese.equals("Y"))
				price = price + 1;
			System.out.println("Your final bill is $" + price);
			break;
		default:
			System.out.println("Invalid option, Please try again!");
			break;
		}
	}
}


