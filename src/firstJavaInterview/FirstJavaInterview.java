package firstJavaInterview;

import java.util.Arrays;

public class FirstJavaInterview {
	void array() {
		int[] jimna={14,13,23,36,44,62,55,74,88,99};
		int[] rojy= new int[jimna.length];
		int i;
		int j = 0;
		for(i=0;i<jimna.length-1;i++)
		{
		if(jimna[i]%2==0)
		rojy[i]= jimna[i];
		System.out.println(rojy[i]);
		}
		
	}

}
