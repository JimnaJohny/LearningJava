package javaWeek1Assignment;

import java.util.Scanner;

public class MainPromoCode {

	public static void main(String[] args) {
		PromoCode promocode= new PromoCode();
		//promocode.priceOfProduct= 100;
		//promocode.promoCode= "";
		System.out.println("Enter the price of Product");
		Scanner sc=new Scanner(System.in);
		promocode.priceOfProduct=sc.nextDouble();
		System.out.println("Select one of the follwing promo codes:\nPromo5\nPromo10\nPromo20");
		promocode.promoCode=sc.next();
		promocode.discount();
		}

}
