package cruiseAssignmentSecond;

import java.util.Scanner;

public class Hotel extends MyBookings {
	Boolean isCorrectHotelType = true;
	String continueSelection = null;
	String hotelType;
	Scanner sc = new Scanner(System.in);
	Deluxe deluxe;
	Family family;
	double basicCharge = 0;
	Boolean isMealsSelected = false;
	int noOfAdults = 0;
	int noOfChildren = 0;
	int noOfNights = 0;

	public void display() {
		do {
			do {
				System.out.println(
						"We offer 2 suite as displayed below.\nPlease enter the cruise that you want to select.\nDeluxe Suite\nFamily Suite");
				hotelType = sc.nextLine();
				isCorrectHotelType = true;
				switch (hotelType.toLowerCase()) {
				case "deluxe suite":
					deluxe = new Deluxe();
					break;
				case "family suite":
					family = new Family();
					break;
				default:
					isCorrectHotelType = false;
					System.out.println("Please select a valid Suite");

				}
			} while (!isCorrectHotelType);
			if (isCorrectHotelType) {
				System.out.println(
						"Please press Y if you want to continue with the selection or press any other alphabet to select another");
				continueSelection = sc.nextLine();
			}

		} while (!continueSelection.equalsIgnoreCase("Y"));
	}

	public void calculateBasicCharge() {
		boolean isAdultNo = true;
		do {
			System.out.println("Enter the number of Adults:");
			noOfAdults = sc.nextInt();
			isAdultNo = true;
			if (noOfAdults <= 0) {
				System.out.println("Number of adults should be atleast 1");
				isAdultNo = false;
			}
		} while (!isAdultNo);
		if (noOfAdults > 0) {
			System.out.println("Enter the number of children:");
			noOfChildren = sc.nextInt();
			System.out.println("Enter the number of nights you want to stay at the Hotel");
			noOfNights = sc.nextInt();
			if (hotelType.equalsIgnoreCase("deluxe suite") && deluxe != null) {
				deluxe.calculateBasicCharge(noOfAdults, noOfChildren, noOfNights);
			} else if (hotelType.equalsIgnoreCase("family suite") && family != null) {
				family.calculateBasicCharge(noOfAdults, noOfChildren, noOfNights);
			}
		}
	}

	public void calculateMealsCharge(Scanner sc) {
		System.out.println("Do you want to pre-book for meals at $25 for adults and $5 for kids? True/False");
		isMealsSelected = sc.nextBoolean();
		if (isMealsSelected) {

			basicCharge = basicCharge + (noOfAdults * 25 + noOfChildren * 5) * noOfNights;
		}
		// return basicCharge;
	}

	@Override
	public double addTax() {
		basicCharge = basicCharge + (basicCharge * 0.18);
		return basicCharge;
	}

}
