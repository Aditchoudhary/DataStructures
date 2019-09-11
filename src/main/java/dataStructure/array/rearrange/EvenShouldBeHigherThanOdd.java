package dataStructure.array.rearrange;

import java.util.Arrays;

/*Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
Output : 4 5 3 6 2 7 1

Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8} 
Output : 4 5 2 6 1 8 1 8*/

public class EvenShouldBeHigherThanOdd {

	public static void main(String[] args) {
		
		int arr[] ={1, 2, 1, 4, 5, 6, 8, 8};
		
		rearrageArray(arr);
	}
	
	public static void rearrageArray(int arr[]) {
		
		int temp[] = new int[arr.length];
		
		for (int i = 0; i < temp.length; i++) {
			 temp[i] = arr[i];			
		}
		
		Arrays.sort(temp);
		//array size
		int n = arr.length;
		
		//total even Positions
		int evenPos = n/2;
		
		//total odd position
		int oddPos = n- evenPos;
		
		//setting odd position
		int j= oddPos - 1;		
		for (int i = 0; i < arr.length; i+=2) {
			arr[i] = temp[j];
			j--;
		}
		
		j = oddPos;
		//setting even position
		for (int i = 1; i < arr.length; i+=2) {
			arr[i] = temp[j];
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
