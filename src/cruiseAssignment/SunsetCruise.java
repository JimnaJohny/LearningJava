package cruiseAssignment;

public class SunsetCruise extends Cruise{
	double priceForAdult;
	double priceForChildren;
	int noOfDays;
	public SunsetCruise(CruiseDetails sunsetCruiseDetails) {
		super(sunsetCruiseDetails, sunsetCruiseDetails);
		this.priceForAdult = sunsetCruiseDetails.getPriceForAdult();
		this.priceForChildren =sunsetCruiseDetails.getPriceForChildren();
		this.noOfDays = sunsetCruiseDetails.getNoOfDays();
	}
	public void sunsetCruise()
	{
		System.out.println("The cruise you have selected is Sunset Cruise which is a "+noOfDays+ " day cruise");
		System.out.println("Price for Adults(greater than 12): "+priceForAdult);
		System.out.println("price for kids above 5: "+priceForChildren);
	}
}

