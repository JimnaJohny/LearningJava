package cruiseAssignment;

public class ScenicCruise extends Cruise{
	double priceForAdult;
	double priceForChildren;
	int noOfDays;
	public ScenicCruise(CruiseDetails scenicCruiseDetails) {
		super(scenicCruiseDetails, scenicCruiseDetails);
		this.priceForAdult = scenicCruiseDetails.getPriceForAdult();
		this.priceForChildren =scenicCruiseDetails.getPriceForChildren();
		this.noOfDays = scenicCruiseDetails.getNoOfDays();
	}
	public void scenicCruise()
	{
		System.out.println("The cruise you have selected is Scenic Cruise which is a "+noOfDays+ " days cruise");
		System.out.println("Price for Adults(greater than 12): "+priceForAdult);
		System.out.println("price for kids above 5: "+priceForChildren);
	}
}
