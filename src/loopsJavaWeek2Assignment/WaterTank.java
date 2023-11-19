package loopsJavaWeek2Assignment;

public class WaterTank {
	int initialVolume=0;
	void fillWaterTank() {
	for(int initialVolume=0;initialVolume<100;initialVolume++)
	{
		initialVolume=initialVolume+10;
		System.out.println("Watertank contains "+initialVolume+" litres of water");
		initialVolume--;
	}
		System.out.println("Tank is reached to its maximum capacity");
	}
}

