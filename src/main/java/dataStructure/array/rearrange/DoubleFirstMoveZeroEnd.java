package dataStructure.array.rearrange;

import java.util.Arrays;

//Double the first element and move zero to end
//https://www.geeksforgeeks.org/double-first-element-move-zero-end/	
public class DoubleFirstMoveZeroEnd {

	public static void main(String[] args) {

		int arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
		
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if( i+1<=arr.length -1 && arr[i] == arr[i+1]) {
				System.out.println(i);
				arr[i] = 2*arr[i];
				arr[i+1] = 0 ;
			}
			
			if(arr[i]!=0) {
				arr[index] = arr[i];
				index++;
			}
			
		}
		
		for (int i = index; i < arr.length; i++) {
			arr[i] = 0;
		}
		

		System.out.println(Arrays.toString(arr));
	}

}
