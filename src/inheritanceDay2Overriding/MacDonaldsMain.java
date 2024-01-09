// SIMPLE METHOD OVERRIDING


package inheritanceDay2Overriding;

public class MacDonaldsMain {

	public static void main(String[] args) {

		MacDonalds macD = new MacDonalds();

		macD.provideBurgers();
		macD.provideFries();

		MacDonaldsIndia macDIndia = new MacDonaldsIndia();

		macDIndia.provideBurgers();
		macDIndia.provideFries();

		MacDonaldsChina macDChina = new MacDonaldsChina();

		macDChina.provideBurgers();

		macDChina.provideFries();

	}

}