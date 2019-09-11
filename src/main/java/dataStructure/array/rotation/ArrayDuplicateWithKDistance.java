package dataStructure.array.rotation;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateWithKDistance {

	
	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 10, 3, 5, 6};
		
		checkDuplicates(arr,3);
		
	}
	
	public static void checkDuplicates(int[] arr, int k){
		Set<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			
			if(hs.contains(arr[i])) {
				System.out.println("Duplicate found within distance :" + k+ " value of i : "+ i  );
				System.out.println("arr[i] : " +  arr[i]);
			}
			if(i>=k)//This should be i>=k, other wise index zero should not be deleted i-k =0
				hs.remove(arr[i-k]);
			
			hs.add(arr[i]);
			
		}
		
	}

}
