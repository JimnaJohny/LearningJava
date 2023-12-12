//Write a program to find smallest and largest number in an array.
package arrayProgramsAskedinInterview;

public class SmallestNumberInArray {
	int findSmallestNumber(int[] arr) {
        int small = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
               small = arr[i];
            }
        }

        return small;

}
	int findMaximumNumber(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;

}
}
