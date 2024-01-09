package cruiseAssignmentSecond;

import java.util.Scanner;

public abstract class Cruise extends MyBookings {
	protected String cruiseName;
	protected double priceForAdult;
	protected double priceForChildren;
	protected int noOfDays;
	int noOfAdults;
	int noOfChildren;
	double basicCharge;
	Boolean isMealsSelected = false;

	public Cruise(String cruiseName, int noOfDays, double priceForAdult, double priceForChildren) {
		this.cruiseName = cruiseName;
		this.priceForAdult = priceForAdult;
		this.priceForChildren = priceForChildren;
		this.noOfDays = noOfDays;
	}

	public void setPassengerNumbers(int noOfAdults, int noOfChildren) {
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
	}

	public void displayCruise() {
	System.out.println("The cruise you have selected is " +cruiseName+ " which is a "+noOfDays+ " days cruise");
	System.out.println("Price for Adults(greater than 12): "+priceForAdult);
	System.out.println("price for kids above 5: "+priceForChildren);
	}
	public void calculateBasicCharge() {
		basicCharge = (priceForAdult * noOfAdults + priceForChildren * noOfChildren) * noOfDays;
		// return basicCharge;
	}

	public void calculateMealsCharge(Scanner sc) {
		System.out.println(
				"All our cruises have food service on board. \nDo you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids? True/False");
		isMealsSelected = sc.nextBoolean();
		if (isMealsSelected) {

			basicCharge = basicCharge + (noOfAdults * 20.99 + noOfChildren * 4.99) * noOfDays;
		}
		// return basicCharge;
	}
	public abstract void additionalService(int noOfAdults, Scanner sc);
	@Override
	public double addTax() {
		basicCharge = basicCharge + (basicCharge * 0.15);
		return basicCharge;
	}

	
}
