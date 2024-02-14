package firstJavaInterview;

import java.util.Arrays;

public class FirstJavaInterview {
	void array() {
		int[] jimna = { 14, 13, 23, 36, 44, 62, 55, 74, 88, 99 };
		int[] rojy = new int[jimna.length];
		int j = 0;
		for (int i = 0; i < jimna.length; i++) {
			if (jimna[i] % 2 == 0) {
				rojy[j] = jimna[i];
				j++;
			}
		}
		for (int k = 0; k < j; k++) {
			System.out.println(rojy[k]);
		}
	}

}
