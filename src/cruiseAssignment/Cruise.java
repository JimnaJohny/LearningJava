package cruiseAssignment;

import java.util.Scanner;

public class Cruise {
	double priceForAdult;
	double priceForChildren;
	int noOfDays;
	int noOfAdults;
	int noOfChildren;
	double basicCharge;
	Boolean isMealsSelected = false;
	Scanner sc = new Scanner(System.in);

	public Cruise(CruiseDetails scenicCruiseDetails, CruiseDetails cruiseDetails) {
		this.priceForAdult = scenicCruiseDetails.getPriceForAdult();
		this.priceForChildren = scenicCruiseDetails.getPriceForChildren();
		this.noOfDays = scenicCruiseDetails.getNoOfDays();
		this.noOfAdults = cruiseDetails.getNoOfAdults();
		this.noOfChildren = cruiseDetails.getNoOfChildren();
	}

	public double calculateBasicCharge() {
		basicCharge = (priceForAdult * noOfAdults + priceForChildren * noOfChildren) * noOfDays;
		return basicCharge;
	}

	public double calculateMealsCharge() {
		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids? True/False");
		isMealsSelected = sc.nextBoolean();
		if (isMealsSelected) {

			basicCharge = basicCharge + (noOfAdults * 20.99 + noOfChildren * 4.99) * noOfDays;
		}
		return basicCharge;
	}

	public double addTax() {
		basicCharge = basicCharge + (basicCharge * 0.15);
		return basicCharge;
	}

}