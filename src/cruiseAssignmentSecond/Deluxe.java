package cruiseAssignmentSecond;

public class Deluxe extends Hotel {
//	public Deluxe() {
//		super();
//	}
	public void calculateBasicCharge(int noOfAdults, int noOfChildren, int noOfNights) {
		if (noOfAdults <= 2 && noOfChildren <= 2)
			basicCharge += noOfNights * 180;
		else
			System.out.println("Deluxe Suite cannot accommodate more than 2 adults and 2 children.");
	}
}
