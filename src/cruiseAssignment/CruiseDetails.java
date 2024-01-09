package cruiseAssignment;

public class CruiseDetails {
	private String cruiseName;
	private double priceForAdult;
	private double priceForChildren;
	private int noOfDays;
	private int noOfAdults;
	private int noOfChildren;

	public CruiseDetails(String cruiseName, double priceForAdult, double priceForChildren, int noOfDays) {
		this.cruiseName = cruiseName;
		this.priceForAdult = priceForAdult;
		this.priceForChildren = priceForChildren;
		this.noOfDays = noOfDays;
	}

	public CruiseDetails(int noOfAdults, int noOfChildren) {
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
	}

	public String getCruiseName() {
		return cruiseName;
	}

	public double getPriceForAdult() {
		return priceForAdult;
	}

	public double getPriceForChildren() {
		return priceForChildren;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public int getNoOfAdults() {
		return noOfAdults;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

}
