package cruiseAssignmentSecond;

public class Family extends Hotel {
	public Family() {
		super();
		System.out.println("You have selected Family Suite which can accommodates maximum of 4 adults and 4 children at $230/night");
	}
	public double calculateBasicCharge(int noOfAdults, int noOfChildren, int noOfNights) {
		int suitesNeeded = Math.max((noOfAdults + 3) / 4, (noOfChildren + 3) / 4);
		System.out.println("You need "+suitesNeeded+" Family Suites to accommodate "+noOfAdults+ " adults and "+noOfChildren+" children");
			basicCharge += suitesNeeded* noOfNights * 230;
		return basicCharge;
	}
}
