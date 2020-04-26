package dataStructure.array.sorting;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {5,3,7,2,1,6};
		
		quick(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		
	}

	private static void quick(int[] arr, int start, int end) {
		
		if(start<end){
		int pi = partion(arr, start, end);
		quick(arr, start , pi-1);
		quick(arr, pi+1, end);
		}
	}

	private static int partion(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int j = start;
		
		for (int i = start; i <= end; i++) {
				if(arr[i]<pivot){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					j++;
				}
		}
		
		int temp = arr[j];
		arr[j] = pivot;
		arr[end] = temp;
		return j;
	}
}
