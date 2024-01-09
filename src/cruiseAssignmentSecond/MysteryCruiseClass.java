package cruiseAssignmentSecond;

import java.util.Scanner;

public class MysteryCruiseClass extends Cruise {
	public MysteryCruiseClass() {
		super("Mystery Cruise", 2, 45.99, 12.99);
	}

	@Override
	public void additionalService(int noOfAdults, Scanner sc) {
		System.out
				.println("Do you want to pre-book for Casino Service($20 per person) available in Mystery Cruise? Y/N");
		String additional = sc.next();
		if (additional.equalsIgnoreCase("Y"))
			basicCharge += noOfAdults * 20;
	}
}
