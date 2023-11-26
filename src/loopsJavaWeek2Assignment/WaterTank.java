//There is a water tank of capacity 100 litres. Water is filled into it using bucket which have capacity of 10 litres.  Write a program which fills the tank to its capacity using these buckets. Also include a mechanism in your program to stop the tank from over flowing.

package loopsJavaWeek2Assignment;

public class WaterTank {
	int initialVolume = 72;
	int tankCapacity = 100;
	int bucketCapacity = 10;
	int breakPoint = 90;

	void fillWaterTank() {
		while (initialVolume < breakPoint) {
			initialVolume = initialVolume + bucketCapacity;
			if (initialVolume <= breakPoint)
			{
				System.out.println("Adding 1 bucket of water");
				System.out.println("Watertank contains " + initialVolume + " litres of water now");
			}
		}
		System.out.println("Tank is reached to its maximum capacity, Adding more water will result in overflow");
	}
}
