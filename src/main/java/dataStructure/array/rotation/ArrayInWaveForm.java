package dataStructure.array.rotation;

import java.util.Arrays;

public class ArrayInWaveForm {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		Arrays.sort(arr);
		
		for (int i = 0, j=1; j < arr.length; i+=2, j+=2) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
