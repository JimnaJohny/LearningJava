package operators;

public class MainArithmetic {

	public static void main(String[] args) {
		// int num1 = 3, num2 = 2;
		ArithmeticOperators equation1 = new ArithmeticOperators();// Object Creation
		equation1.num1 = 3;
		equation1.num2 = 2;
		equation1.add();
		equation1.subtract();
		equation1.multiply();
		equation1.division();

	}

}
