package cruiseAssignmentSecond;

import java.util.Scanner;

public class ScenicCruiseClass extends Cruise {
	public ScenicCruiseClass() {
		super("Scenic Cruise", 3, 43.99, 12.99);
	}

	@Override
	public void additionalService(int noOfAdults, Scanner sc) {
		System.out.println("Do you want to pre-book for Spa Service($50 per person) available in Scenic Cruise? Y/N");
		String additional = sc.next();
		if (additional.equalsIgnoreCase("Y"))
			basicCharge += noOfAdults * 50;
	}
}
