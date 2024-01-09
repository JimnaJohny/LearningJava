package inheritanceDay2Overriding;

public class MacDonaldsIndia extends MacDonalds {

	@Override
	public void provideBurgers() {
		System.out.println("Provide Veggie Burgers");
	}

	public void provideSamosa() {
		System.out.println("Provide Samosa as starters");
	}

}