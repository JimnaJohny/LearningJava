package cruiseAssignmentSecond;

import java.util.Scanner;

public class SunsetCruiseClass extends Cruise {
	public SunsetCruiseClass() {
		super("Sunset Cruise", 1, 52.99, 15.99);

	}

	@Override
	public void additionalService(int noOfAdults, Scanner sc) {
		System.out.println(
				"Do you want to pre-book for Candle light dinner($45 per person) available in Sunset Cruise? Y/N");
		String additional = sc.next();
		if (additional.equalsIgnoreCase("Y"))
			basicCharge += noOfAdults * 45;
	}
}
