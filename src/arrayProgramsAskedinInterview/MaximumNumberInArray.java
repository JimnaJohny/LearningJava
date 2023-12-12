//Write a program to find the maximum number in an array.
package arrayProgramsAskedinInterview;

public class MaximumNumberInArray {
	int findMaximumNumber(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;

}
}
