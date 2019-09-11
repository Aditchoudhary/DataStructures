package dataStructure.array.max;

import java.util.Arrays;

public class AllZerosAtLast {

	public static void main(String[] args) {
		int[] arr = {0,0,0,1};
		int indexPointed = arr.length-1;
	
		for (int i = 0; i < arr.length; i++) {
					
			if(arr[i] == 0 && indexPointed > i)
			{	
				if(arr[indexPointed] !=0) {
				int temp = arr[indexPointed];
				arr[indexPointed] = arr[i];
				arr[i] = temp;
				indexPointed --;
				}
				else {
					i--;
					indexPointed --;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
