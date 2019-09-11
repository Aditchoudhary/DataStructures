package dataStructure.array.rotation;

import java.util.HashSet;

public class DuplicateWithInDistanceK {

	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 110, 3,10, 5, 6};
		int k = 3;
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
		
			if(hs.contains(arr[i])) {
				System.out.println("Duplicate found within distance :" + k+ " value of i : "+ i  );
				System.out.println("arr[i] : " +  arr[i]);
			}
			if(i>=k)
				hs.remove(arr[i-k]);
			
			hs.add(arr[i]);
			
		}
		
	}

}
