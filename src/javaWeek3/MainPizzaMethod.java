package javaWeek3;

import java.util.Scanner;

public class MainPizzaMethod {
	public static void main(String[] args) {
		String size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your Pizza size:");
		System.out.println("Small");
		System.out.println("Medium");
		System.out.println("Large");
		size = sc.nextLine();
		PizzaMethod order = new PizzaMethod();
		order.printBill(size);
	}

}
