package dataStructure.educative.twoPointer;

/**
 * Given an array of sorted numbers and a target sum, 
 * find a pair in the array whose sum is equal to the given target.
 * @author Adit Choudhary
 *
 */
public class PairWithTargetSum {

	public static void main(String[] args) {
		int[] result = PairWithTargetSum.search(new int[] { 1, 2, 3, 4, 6 }, 6);
	    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
	    result = PairWithTargetSum.search(new int[] { 2, 5, 9, 11 }, 11);
	    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");

	}

	private static final int[] search(int[] arr, int targetSum){
		int a=0, b=0;
		int i=0;
		int j= arr.length -1 ;
		while(j>i){
			if(arr[i]+arr[j]>targetSum){
				j--;
			}else if(arr[i]+arr[j]<targetSum){
				i++;
			}else{
				a = arr[i];
				b= arr[j];
				i++;
				j--;
			}

		}
		
		
		return new int[]{a,b};
	}
	
}
