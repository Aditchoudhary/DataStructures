package dataStructure.educative.slidingWindow;

public class FindSubArrayHavingSumGreaterOrEqualToGivenSum {
	
	static class  Result{
		int sum;
		int startIndex;
		int endIndex;
		
		@Override
		public String toString() {
			return "Result [sum=" + sum + ", startIndex=" + startIndex + ", endIndex=" + endIndex + "]";
		}
		
	}

	public static void main(String[] args) {
		Result result = getResult(new int[] { 2, 1, 5, 2, 3, 2 }, 7);
		System.out.println(result);
		
	}
	
	private static Result getResult(int[] arr, int givenSum){
		int currSum=0, windowStart=0;
		Result result = new Result();
		result.sum = Integer.MIN_VALUE;
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			currSum = currSum + arr[windowEnd];
			
			while(currSum>=givenSum){
				
				if(result.sum < currSum){
					result.startIndex = windowStart;
					result.endIndex = windowEnd;
					result.startIndex = currSum;
				}
				
				currSum = currSum - arr[windowStart];
				windowStart++;
			}
			
		}
		
		return result;
	}

	
	
}
