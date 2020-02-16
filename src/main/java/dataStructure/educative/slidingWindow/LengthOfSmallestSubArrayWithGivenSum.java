package dataStructure.educative.slidingWindow;

/**
 * find the length of the smallest contiguous subarray whose sum is greater than
 * or equal to ‘S’.
 * 
 * @author Adit Choudhary
 *
 */
public class LengthOfSmallestSubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 1, 6 };

		int result = getResult(arr, 7);
		System.out.println(result);

	}

	private static int getResult(int[] arr, int k) {
		if (arr.length <= 0 || k <= 0)
			return 0;

		int sum = 0;
		int start = 0;
		int length = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

			while (sum >= k) {
				sum = sum - arr[start];

				length = Math.min(length, i - start + 1);
				start++;
			}

		}

		return length;
	}
}
