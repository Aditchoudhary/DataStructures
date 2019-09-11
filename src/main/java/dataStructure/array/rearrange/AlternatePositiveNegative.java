package dataStructure.array.rearrange;

import java.util.Arrays;

public class AlternatePositiveNegative {

	public static void rearrange(int[] arr, int size) {
		int k=-1;
		int temp;
		for (int i = 0; i < size; i++) {
			
			if(arr[i]<0) {
				k++;
				temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp; 	
			}
		}
		
		System.out.println(Arrays.toString(arr));

		int pos = ++k;
		int neg = 0;
		int m=1;
		while(pos < size && neg < pos && arr[neg] < 0) {
		temp = arr[neg];
		arr[neg] = arr[pos];
		arr[pos] = temp;
		pos++;
		neg+=2;
		System.out.println(neg);
		}
	System.out.println(Arrays.toString(arr));	
	}
	
	
	public static void main(String[] args) {
		int arr[] = {-1, -2,-3,4,5};
        int n = arr.length; 
        rearrange(arr,n); 
	}

}
