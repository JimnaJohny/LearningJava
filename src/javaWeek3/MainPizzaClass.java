package javaWeek3;

import java.util.Scanner;

public class MainPizzaClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your Pizza size:\nSmall\nMedium\nLarge");
		String size = sc.nextLine();
		PizzaClass pizzaShop= new PizzaClass();
		Boolean isCorrectSizeSelected= pizzaShop.typeOfPizza(size);
		if(isCorrectSizeSelected)
		{
		System.out.println("Do you need extra pepperoni topping? True/False");
		Boolean isPepperoniRequired  = sc.nextBoolean();
		pizzaShop.pepperoniToppings(size,isPepperoniRequired);
		System.out.println("Do you need extra cheese? True/False");
		Boolean isCheeseRequired = sc.nextBoolean();
		pizzaShop.cheeseToppings(size, isCheeseRequired);
		int finalPrice= pizzaShop.displayFinalBill();
		System.out.println("Your final bill is: "+ finalPrice);
		}
		

	}

}
