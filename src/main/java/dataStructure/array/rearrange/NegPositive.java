package dataStructure.array.rearrange;

import java.util.Arrays;

public class NegPositive {

	// i/p -> {-1, 2, -3, 4, 5, 6, -7, 8, 9}
	//o/p->     4   -3    5   -1    6   -7    2    8    9
	public static void main(String[] args) {

		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9}; 
        int n = arr.length; 
        rearrange(arr,n); 
        
	}

	private static void rearrange(int[] arr, int n) {

		int indexToNeg = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]<0) {
				int temp = arr[indexToNeg];
				arr[indexToNeg] = arr[i];
				arr[i] = temp;
				indexToNeg++;
			} 
		}
		
		int oddPos = 0;
		while(indexToNeg< n && arr[oddPos]<0 && oddPos < indexToNeg) {
			int temp = arr[indexToNeg];
			arr[indexToNeg] = arr[oddPos];
			arr[oddPos] = temp;
			oddPos+=2;
			indexToNeg++;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
