package dataStructure.educative.slidingWindow;
/**
 * Maximum Sum Subarray of Size K (easy)
 * @author Adit Choudhary
 *
 */
public class MaxSumSubArraySizeK {

	public static void main(String[] args) {
			int[] arr ={2, 3, 4, 1, 5}; 
			int	result= getMaxSumOfSubArray(arr, 2);
			System.out.println("Result:= "+ result);
	}

	private static int getMaxSumOfSubArray(int[] arr, int k){
		if(arr.length<0 || k == 0)
			return 0;
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int start = 0; int count = 0;
		
		for (int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
			count++;
			
			while(start<=j &&count>k){
				sum = sum - arr[start];
				start++;
				count--;
			}
			
			if(count==k){
				maxSum = Math.max(maxSum, sum);
			}

		}
		
		
		return maxSum;
	}
}
