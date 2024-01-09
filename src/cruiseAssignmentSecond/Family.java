package cruiseAssignmentSecond;

public class Family extends Hotel {
//	public Family() {
//		super();
//	}
	public void calculateBasicCharge(int noOfAdults, int noOfChildren, int noOfNights) {
		if (noOfAdults <= 4 && noOfChildren <= 4)
			basicCharge += noOfNights * 230;
		else
			System.out.println("Family Suite cannot accommodate more than 4 adults and 4 children.");
	}
}
