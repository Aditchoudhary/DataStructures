package dataStructure.educative.slidingWindow;

public class SubArrayOfGivenLengthWithMaxSum {
	
	public static void main(String[] args) {
		
		System.out.println(findResult(new int[] {2,1,5,1,3,2}, 3));
		System.out.println(findResult(new int[] {2,3,4,1,5}, 2));
		 	
	}

	private static int findResult(int[] arr, int k){
		
		int sum = Integer.MIN_VALUE;
		int start = 0;
		int curSum = 0 ;
		for (int end = 0; end < arr.length; end++) {
			curSum = curSum + arr[end];
			while(end - start + 1 >= k){
				sum = Math.max(sum, curSum);
				curSum = curSum - arr[start];
				start++;
			}
		}
		return sum;
	}
}
