package amusementParkRides;

public class AmusementParkRides {
	int height;

	void allowToRides() {
		if (200 < height || height < 90)
			System.out.println("Not allowed in rides");
		else
			System.out.println("Allowed in rides");
	}
}
