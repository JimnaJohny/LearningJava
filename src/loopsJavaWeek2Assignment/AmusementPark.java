// In Amusement park, a ride can carry max 10 people. Write a code to help the operator from overfilling the ride i.e  more than 10 people should not be allowed to get on the ride.  Also ensure that the people getting on the ride meets the height criteria , Height of person should be greater than 90 cm but less than 200 cm.

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
