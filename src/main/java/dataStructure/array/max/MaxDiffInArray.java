package dataStructure.array.max;

public class MaxDiffInArray {

	public static void main(String[] args) {
		int[] arr = new int[] {2,5,7,3,1};

		System.out.println(getMaxDiff(arr));
		System.out.println(getMaxDiff2(arr));
	}

	private static int getMaxDiff(int[] arr) {
		//only for larger element appears after the smaller number
		int max_diff = arr[1]-arr[0];
		int min_element = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]-min_element>max_diff)
			{
				max_diff = arr[i]-min_element;
			}
			
			if(min_element>arr[i]) {
				min_element = arr[i];
			}
		}

		
		return max_diff;
	}
	
	
	private static int getMaxDiff2(int[] arr) {
		
		// this works for whole array 
		
		int max_element = arr[0];
		int min_element = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(max_element<arr[i])
				max_element = arr[i];
			
			if(min_element>arr[i])
				min_element = arr[i];

		}


		System.out.println("min :" + min_element);
		System.out.println("max :" + max_element);
		
		
		return max_element - min_element;
	}
}
