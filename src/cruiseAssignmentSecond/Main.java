package cruiseAssignmentSecond;

import java.security.Provider.Service;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		System.out.println("Welcome to Cruise Booking.\nPlease sign up to book a cruise.");
		System.out.println("Enter your email address");
		String emailId = sc.nextLine();
		user.setEmailId(emailId);
		System.out.println("Enter the password you want to use");
		String password = sc.nextLine();
		user.setPassword(password);
		System.out.println("Enter your full name");
		String name = sc.nextLine();
		user.setName(name);
		System.out.println("Enter your phone number");
		String phoneNumber = sc.nextLine();
		user.setPhoneNumber(phoneNumber);
		System.out.println("Thank you for registering!");
		Boolean iscorrectUsername = true;
		String usernameEntered;
		String passwordEntered;
		do {
			System.out.println("Please login with your username and password.\nEnter your username/email id");
			usernameEntered = sc.nextLine();
			System.out.println("Enter your password");
			passwordEntered = sc.nextLine();
			iscorrectUsername = true;
			if (!usernameEntered.equalsIgnoreCase(user.getEmailId())
					|| !passwordEntered.equalsIgnoreCase(user.getPassword())) {
				iscorrectUsername = false;
				System.out.println("Invalid username or password");
			}
		} while (!iscorrectUsername);
		if (usernameEntered.equalsIgnoreCase(user.getEmailId())
				&& passwordEntered.equalsIgnoreCase(user.getPassword())) {
			boolean isCorrectService = true;
			String service;
			do {
				isCorrectService = true;
				System.out.println("Please enter the service you want to book. Hotel Stay/ Cruise");
				service = sc.nextLine();
				if (!(service.equalsIgnoreCase("Hotel Stay")) && !(service.equalsIgnoreCase("Cruise"))) {
					isCorrectService = false;
					System.out.println("Invalid Entry!");
				}
			} while (!isCorrectService);
			if (service.equalsIgnoreCase("Cruise")) {
				Cruise cruise = new Cruise(null, 0, 0, 0);
				Boolean isCorrectCruiseType = true;
				String continueSelection = null;
				String cruiseType;
				do {
					do {
						System.out.println(
								"We offer 4 different packaes as displayed below.\nPlease enter the cruise that you want to select.\nScenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise");
						cruiseType = sc.nextLine();
						isCorrectCruiseType = true;
						switch (cruiseType.toLowerCase()) {
						case "scenic cruise":
							cruise = new ScenicCruiseClass();
							break;
						case "sunset cruise":
							cruise = new SunsetCruiseClass();
							break;
						case "discovery cruise":
							cruise = new DiscoveryCruiseClass();
							break;
						case "mystery cruise":
							cruise = new MysteryCruiseClass();
							break;
						default:
							isCorrectCruiseType = false;
							System.out.println("Please select a valid cruise");

						}
					} while (!isCorrectCruiseType);
					cruise.displayCruise();
					if (isCorrectCruiseType) {
						System.out.println(
								"Please press Y if you want to continue with the selection or press any other alphabet to select another");
						continueSelection = sc.nextLine();
					}

				} while (!continueSelection.equalsIgnoreCase("Y"));
				boolean isAdultNo = true;
				int noOfAdults = 0;
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
					System.out.println("Enter the number of children below 5 years:");
					int noOfChildrenBelow5 = sc.nextInt();
					if (noOfChildrenBelow5 > 0)
						System.out.println(noOfChildrenBelow5 + " children can enjoy the service for free");
					System.out.println("Enter the number of children 5 years or above:");
					int noOfChildren = sc.nextInt();
					cruise.setPassengerNumbers(noOfAdults, noOfChildren);
					cruise.calculateBasicCharge();
					cruise.calculateMealsCharge(sc);
					cruise.additionalService(noOfAdults, sc);
					double totalCharge = cruise.addTax();
					System.out.println("Total charge is " + String.format("%.2f", totalCharge));
				}

			} else if (service.equalsIgnoreCase("Hotel Stay")) {
				Hotel hotel = new Hotel();
				hotel.display();
				hotel.calculateBasicCharge();
				hotel.calculateMealsCharge(sc);
				double totalCharge = hotel.addTax();
				System.out.println("Total charge is " + String.format("%.2f", totalCharge));
			}
		}
		Boolean isCorrectitemSelected = true;
		System.out.println(
				"Do you want to change your personal information?\nPress Y to change, Press any other alphabet to exit");
		String changeInfo = sc.next();
		if (changeInfo.equalsIgnoreCase("Y")) {
			int count = 0;
			String existingPassword;
			do {
				System.out.println("Enter your exixting password");
				existingPassword = sc.next();
				if (!existingPassword.equals(user.getPassword())) {
					System.out.println("Invalid password! Try again");
					count++;
				} else
					break;
			} while (count < 3);
			if (count == 3)
				System.out.println("You entered wrong password three times, please come again!");
			if (existingPassword.equals(user.getPassword()))
				do {
					isCorrectitemSelected = true;
					System.out.println(
							"Please enter the information you want to change:\n1. Password\n2. Phone number\n3. Email id");
					int infoToChange = sc.nextInt();
					switch (infoToChange) {
					case 1:
						System.out.println("Enter your new password");
						String newPassword = sc.next();
						user.setPassword(newPassword);
						System.out.println("Your password has been changed!");
						break;
					case 2:
						System.out.println("Enter your new phone number");
						String newPhoneNumber = sc.next();
						user.setPhoneNumber(newPhoneNumber);
						System.out.println("Your phone number has been changed!");
						// System.out.println("Your new phone number is "+user.getPhoneNumber());
						break;
					case 3:
						System.out.println("Enter your new email id");
						String newEmailId = sc.next();
						user.setPhoneNumber(newEmailId);
						System.out.println("Your email id has been changed!");
						break;
					default:
						System.out.println("Invalid Entry!");
						isCorrectitemSelected = false;
						break;
					}
				} while (!isCorrectitemSelected);
		}
		System.out.println("Thank You for using the service!");
	}
}
