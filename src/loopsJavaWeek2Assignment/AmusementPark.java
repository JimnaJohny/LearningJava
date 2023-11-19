package loopsJavaWeek2Assignment;

import java.util.Scanner;

public class AmusementPark {
	int height;

	void allowToRides() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter the height of Person " + i + ":");
			Scanner sc = new Scanner(System.in);
			height = sc.nextInt();

			if (200 < height || height < 90) {
				System.out.println("Not allowed in the ride");
				i--;
			} else
				System.out.println("Please enter in the Ride");
		}
		System.out.println("Sorry! Ride is full with 10 people now! No more people allowed");
	}
}
