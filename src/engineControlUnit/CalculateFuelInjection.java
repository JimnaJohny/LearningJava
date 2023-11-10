package engineControlUnit;

public class CalculateFuelInjection {
	int xThrottle, yFuel;

	void calculateFuelInjection() {
		if (xThrottle <= 127)
			yFuel = xThrottle * 2;
		else
			yFuel = xThrottle + 127;
		System.out.println("yFuel valve is: " + yFuel);
	}
}
