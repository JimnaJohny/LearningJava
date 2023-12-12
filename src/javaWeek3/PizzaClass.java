package javaWeek3;

import java.util.Scanner;

public class PizzaClass {
	int price;
	String topping;
	String cheese;
	Scanner sc = new Scanner(System.in);
	Boolean isValidSizeSelected=true;
	Boolean typeOfPizza(String size) {
		switch (size) {
		case "Small":
			price += 15;
			break;
		case "Medium":
			price += 20;
			break;
		case "Large":
			price += 25;
			break;
		default:
			System.out.println("Invalid option, Please try again!");
			isValidSizeSelected=false;
			break;
		}
		return isValidSizeSelected;
	}

	void pepperoniToppings(String size, Boolean isPepperoniRequired) {
		if(isPepperoniRequired!=null)
		{
		if(isPepperoniRequired)
		{
		if (size.equalsIgnoreCase("Small"))
			price = price + 2;
		else if (size.equalsIgnoreCase("Medium"))
			price = price + 3;
		else if (size.equalsIgnoreCase("Large"))
			price = price + 3;
		}
		}
		else
			System.out.println("Invalid entry!!!");
	}
	void cheeseToppings(String size, Boolean isCheeseRequired) {
		if(isCheeseRequired!=null)
		{
		 if(isCheeseRequired)
			price = price + 1;
		}
		else
			System.out.println("Invalid entry!!!");
	}
	int displayFinalBill()
	{
		return price;
	}
}
