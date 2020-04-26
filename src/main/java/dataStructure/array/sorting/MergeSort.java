package dataStructure.array.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {12, 23, 20, 3, 4, 7,2};
		
		merge(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");	
		}
		
	}

	private static void merge(int[] arr, int start, int end) {
		
		if(start<end){
		
			int mid = (start + end)/2;
			
			merge(arr, start, mid);
			merge(arr, mid+1, end);
			
			sorting(arr, start,mid, end);
		}
		
	}

	private static void sorting(int[] arr, int start, int mid, int end) {
		int[] left = new int[mid- start + 1 ];
		int[] right = new int[end - mid];
		
		int r =0;
		for (int i = mid+1; i <=end; i++) {
			right[r] = arr[i];
			r++;
		}
		
		int l =0;
		for(int j= start; j<=mid; j++){
			left[l] = arr[j];
			l++;
		}
		
		l=0; r= 0;
		int	k = start;
		while(l<left.length && r<right.length){
			
			if(left[l]>right[r]){
				arr[k] = right[r];
				r++;
				k++;
			}
			else
			{
				arr[k] = left[l];
				l++;
				k++;
			}
			
		}
		
		while(l<left.length){
			arr[k] = left[l];
			l++;
			k++;
		}
		
		while(r<right.length){
			arr[k] = right[r];
			r++;
			k++;
		}
		
	}

}
