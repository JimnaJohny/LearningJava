package cruiseAssignment;

public class MysteryCruise extends Cruise{
	double priceForAdult;
	double priceForChildren;
	int noOfDays;
	public MysteryCruise(CruiseDetails mysteryCruiseDetails) {
		super(mysteryCruiseDetails, mysteryCruiseDetails);
		this.priceForAdult = mysteryCruiseDetails.getPriceForAdult();
		this.priceForChildren =mysteryCruiseDetails.getPriceForChildren();
		this.noOfDays = mysteryCruiseDetails.getNoOfDays();
	}
	public void mysteryCruise()
	{
		System.out.println("The cruise you have selected is Mystery Cruise which is a "+noOfDays+ " days cruise");
		System.out.println("Price for Adults(greater than 12): "+priceForAdult);
		System.out.println("price for kids above 5: "+priceForChildren);
	}
}
