package dataStructure.educative.twoPointer;
/**
 * 
 * @author Adit
 * Given an array containing 0s, 1s and 2s, sort the array in-place.
 * You should treat numbers of the array as objects,
 * hence, we can’t count 0s, 1s, and 2s to recreate the array.
 *
 */
public class DutchFlagProblem {

	public static void main(String[] args) {
		 int[] arr = new int[] { 1, 0, 2, 1, 0 };
		 
		 sort(arr);
		 
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

	private static void sort(int[] arr) {
		
		int low =0;
		int high = arr.length -1 ;
		for (int i = 0; i <=high; ) {
			if(arr[i]==0){
				swap(low,arr, i);
				low++;
				i++;
			}else if(arr[i]==2){
				swap(high,arr, i);
				high--;
			}else{
				i++;
			}
		}
		
	}

	private static void swap(int j, int[] arr, int i) {
		
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
	
}
