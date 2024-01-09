package cruiseAssignment;

public class DiscoveryCruise extends Cruise{
	double priceForAdult;
	double priceForChildren;
	int noOfDays;
	public DiscoveryCruise(CruiseDetails discoveryCruiseDetails) {
		super(discoveryCruiseDetails, discoveryCruiseDetails);
		this.priceForAdult = discoveryCruiseDetails.getPriceForAdult();
		this.priceForChildren =discoveryCruiseDetails.getPriceForChildren();
		this.noOfDays = discoveryCruiseDetails.getNoOfDays();
	}
	public void discoveryCruise()
	{
		System.out.println("The cruise you have selected is Discovery Cruise which is a "+noOfDays+ " days cruise");
		System.out.println("Price for Adults(greater than 12): "+priceForAdult);
		System.out.println("price for kids above 5: "+priceForChildren);
	}
}
