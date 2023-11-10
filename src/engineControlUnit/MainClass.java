package engineControlUnit;

public class MainClass {

	public static void main(String[] args) {
		CalculateFuelInjection calculateFuelInjection = new CalculateFuelInjection();
		calculateFuelInjection.xThrottle = 500;
		calculateFuelInjection.calculateFuelInjection();
	}

}
