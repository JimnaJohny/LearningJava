package polymorphismExample;

public class PolyMorph {

	public double addNumbers(int num1, int num2) {
		return num1 + num2;
	}

	public double addNumbers(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public double addNumbers(double num1, int num2) {
		return num1 + num2;
	}

	public double addNumbers(double num1, double num2) {
		return num1 + num2;
	}
	
	public double addNumbers(int num1, double num2) {
		return num1 + num2;
	}

}
