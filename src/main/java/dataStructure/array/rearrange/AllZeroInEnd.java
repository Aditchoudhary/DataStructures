package dataStructure.array.rearrange;

import java.util.Arrays;

//https://www.geeksforgeeks.org/move-zeroes-end-array/

/*For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, 
it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. 
The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).
*/
public class AllZeroInEnd {

	public static void main(String[] args) {
		int arr1[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		method2(arr1);

		int arr2[] = { 0, 0,  0, 0};
		method2(arr2);

		int arr3[]  = {1, 2, 0, 0, 0, 3, 6};
		method2(arr3);

		int arr4[] = {1, 2, 0, 4, 3, 0, 5, 0};
		//Method1(arr);
		method2(arr4);
	}
	
	
	public static void method2(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
				arr[count++]= arr[i];
		}
		
		while(count<arr.length) {
			arr[count++]= 0;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void Method1(int arr[]){
		//Not O(n)
		int indexToSwap = -1;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==0 && indexToSwap == -1) {
				indexToSwap =i;
			}			
			
			if(arr[i]!=0 && indexToSwap != -1 && indexToSwap < i) {
				int temp = arr[i];
				arr[i] = arr[indexToSwap];
				arr[indexToSwap] = temp;
				i = indexToSwap;
				indexToSwap = -1;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
