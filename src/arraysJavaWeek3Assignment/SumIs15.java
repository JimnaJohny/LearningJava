//You are given a array of integer. You need to find all numbers whose sum is 15
//array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
//Pair of elements whose sum is equal to 15 :  7, 8 and -5, 20

package arraysJavaWeek3Assignment;

public class SumIs15 {
	int array[] = {-40, -5, 1, 3, 6, 7, 8, 20};
	int i;
	int j;

	void isSum15() {
		System.out.println("Pair of elements whose sum is equal to 15:");
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				int sum = array[i] + array[j];
				if (sum == 15) {
					System.out.println(array[i] + "," + array[j]);
				}
			}
		}

	}
}
