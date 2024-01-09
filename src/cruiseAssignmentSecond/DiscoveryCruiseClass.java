package cruiseAssignmentSecond;

import java.util.Scanner;

public class DiscoveryCruiseClass extends Cruise {
	public DiscoveryCruiseClass() {
		super("Discovery Cruise", 4, 39.99, 9.99);
	}

	@Override
	public void additionalService(int noOfAdults, Scanner sc) {
		System.out.println(
				"Do you want to pre-book for Adventure Games($50 per person) available in Discovery Cruise? Y/N");
		String additional = sc.next();
		if (additional.equalsIgnoreCase("Y"))
			basicCharge += noOfAdults * 50;
	}
}
