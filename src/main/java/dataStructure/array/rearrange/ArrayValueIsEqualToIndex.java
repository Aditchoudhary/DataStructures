package dataStructure.array.rearrange;

import java.util.Arrays;

public class ArrayValueIsEqualToIndex {

	public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}; 
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; ) {
			if (arr[i]>= 0 && arr[i]!=i) {
				int elm = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = elm;
			} else {
					i++;
			}
		}
        
        System.out.println(Arrays.toString(arr));
	}

}
