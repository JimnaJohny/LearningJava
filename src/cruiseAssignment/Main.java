package cruiseAssignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CruiseDetails scenicCruiseDetails = new CruiseDetails("Scenic Cruise", 43.99, 12.99, 3);
		CruiseDetails sunsetCruiseDetails = new CruiseDetails("Sunset Cruise", 52.99, 15.99, 1);
		CruiseDetails discoveryCruiseDetails = new CruiseDetails("Discovery Cruise", 39.99, 9.99, 4);
		CruiseDetails mysteryCruiseDetails = new CruiseDetails("Mystery Cruise", 45.99, 12.99, 2);
		Scanner sc = new Scanner(System.in);
		Boolean isCorrectCruiseType = true;
		String continueSelection = null;
		// Cruise selectedCruise = null;
		do {
			do {
				System.out.println(
						"We offer 4 different packaes as displayed below.\nPlease enter the cruise that you want to select.\nScenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise");
				String cruiseType = sc.nextLine();
				switch (cruiseType.toLowerCase()) {
				case "scenic cruise":
					ScenicCruise scenic = new ScenicCruise(scenicCruiseDetails);
					scenic.scenicCruise();

					break;
				case "sunset cruise":
					SunsetCruise sunset = new SunsetCruise(sunsetCruiseDetails);
					sunset.sunsetCruise();
					break;
				case "discovery cruise":
					DiscoveryCruise discovery = new DiscoveryCruise(discoveryCruiseDetails);
					discovery.discoveryCruise();
					break;
				case "mystery cruise":
					MysteryCruise mystery = new MysteryCruise(mysteryCruiseDetails);
					mystery.mysteryCruise();
					break;
				default:
					isCorrectCruiseType = false;
					System.out.println("Please select a valid cruise");

				}
			} while (!isCorrectCruiseType);
			if (isCorrectCruiseType = true) {
				System.out.println(
						"Please press Y if you want to continue with the selection or press any other alphabet to select another");
				continueSelection = sc.nextLine();
			}
		} while (!continueSelection.equalsIgnoreCase("Y"));
		System.out.println("Enter the number of Adults:");
		int noOfAdults = sc.nextInt();
		System.out.println("Enter the number of children below 5 years:");
		int noOfChildrenBelow5 = sc.nextInt();
		if (noOfChildrenBelow5 > 0)
			System.out.println(noOfChildrenBelow5 + " children can enjoy the service for free");
		System.out.println("Enter the number of children above 5 years or above:");
		int noOfChildren = sc.nextInt();
		CruiseDetails cruiseDetails = new CruiseDetails(noOfAdults, noOfChildren);
		Cruise cruise = new Cruise(scenicCruiseDetails, cruiseDetails);
//		cruise= new ScenicCruise(scenicCruiseDetails);
//		cruise= new SunsetCruise(scenicCruiseDetails);
//		cruise= new DiscoveryCruise(scenicCruiseDetails);
//		cruise= new MysteryCruise(scenicCruiseDetails);
		double basicCharge = cruise.calculateBasicCharge();
		basicCharge = cruise.calculateMealsCharge();
		double totalCharge = cruise.addTax();
		System.out.println("Total charge is " + totalCharge);
	}

}
