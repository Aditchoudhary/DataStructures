package dataStructure.educative.twoPointer;

/**
 * Given an array of sorted numbers, remove all duplicates from it. 
 * You should not use any extra space;
 * after removing the duplicates in-place return the new length of the array.
 * @author aditm
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		 	int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
		    System.out.println(RemoveDuplicates.remove(arr));

		    arr = new int[] { 2, 2, 2, 11 };
		    System.out.println(RemoveDuplicates.remove(arr));
	}

	public static int remove(int[] arr) {
		if(arr.length>0){
		int k=0;
		int l = k+1;
		
		while(l<arr.length){
			
			if(arr[k]!=arr[l]){
				arr[k+1]=arr[l];
				k++;
			}
			
			l++;
		}
		
		// length is index + 1 ;
		return k+1;
		
		}
		
		return 0;
	}
}
