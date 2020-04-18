package dataStructure.educative.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
 * @author Adit Choudhary
 *
 */
public class TripletSumToZeroUsingHashSet {

	public static void main(String[] args) {
		System.out.println(searchTriplets(new int[] { -3, 0, 1, 2, -1, 1, -2 }));
	    System.out.println(searchTriplets(new int[] { -5, 2, -1, -2, 3 }));
	}

	public static List<List<Integer>> searchTriplets(int[] arr) {
		List<List<Integer>> triplets = new ArrayList<List<Integer>>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-2; i++) {
			int target = arr[i];
			if(i==i+1)
				continue;
			
			triplets=getPair(arr,-target, i+1, triplets);
		}
		
		return triplets;
	}
		
	public static List<List<Integer>> getPair(int[] arr ,int target, int left, List<List<Integer>> triplets){
		int right = arr.length-1;
		while(right>left){
			
			if(arr[left]+arr[right]>target){
				right--;
			}else if(arr[left]+arr[right]< target){
				left++;
			} else {
				List<Integer> triplet = Arrays.asList(arr[left], arr[right], -target);
				triplets.add(triplet);
				right--;
				left++;
				
				while(left< right && arr[left]==arr[left-1]){
					left++;
				}
				
				while(left< right &&  arr[right]==arr[right+1]){
					right--;
				}
			}
			
		}
		
		return triplets;
	}
}
