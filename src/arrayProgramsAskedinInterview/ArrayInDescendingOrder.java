package arrayProgramsAskedinInterview;

public class ArrayInDescendingOrder {
	
	int[] descendingOrder(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            	for(int j=0;j<arr.length-1;j++)
            	{
            		  if(arr[j]<arr[j+1])
            		  {
            			  int temp = arr[j];
                          arr[j] = arr[j + 1];
                          arr[j + 1] = temp;
            		  }
                
            }
        }

        return arr;

}
}
