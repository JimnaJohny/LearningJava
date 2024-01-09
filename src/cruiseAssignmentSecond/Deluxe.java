package cruiseAssignmentSecond;

public class Deluxe extends Hotel {
	public Deluxe() {
		super();
		System.out.println("You have selected Deluxe Suite which can accommodates maximum of 2 adults and 2 children at $180/night");
	}
	public double calculateBasicCharge(int noOfAdults, int noOfChildren, int noOfNights) {
		int suitesNeeded = Math.max((noOfAdults + 1) / 2, (noOfChildren + 1) / 2);
		System.out.println("You need "+suitesNeeded+" Deluxe Suites to accommodate "+noOfAdults+ " adults and "+noOfChildren+" children");
			basicCharge += suitesNeeded* noOfNights* 180;
		return basicCharge;
	}
}
