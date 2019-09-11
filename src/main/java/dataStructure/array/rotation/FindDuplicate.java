package dataStructure.array.rotation;

//Java code to find
//duplicates in O(n) time 

class FindDuplicate 
{ 
//Function to print duplicates 
	void printRepeating(int arr[], int size) 
	{ 
		int i; 
		System.out.println("The repeating elements are : "); 
		for (i = 0; i < size; i++) 
		{ 
			if (arr[Math.abs(arr[i])] >= 0) 
			{	/*System.out.println("index: "+ i);
				System.out.println("arr[i] "+arr[i]);
				System.out.println("Math.abs(arr[i]) "+Math.abs(arr[i]));*/
				//System.out.println("-Math.abs(arr[i]) "+ -Math.abs(arr[i]));

				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
				//System.out.println(Arrays.toString(arr));

			} 
			else
				System.out.print(Math.abs(arr[i]) + " "); 
		}		 
	} 

	// Driver program 
	public static void main(String[] args) 
	{ 
		FindDuplicate duplicate = new FindDuplicate(); 
		int arr[] = {2, 5, 2, 5, 3, 6, 6,7}; 
		int arr_size = arr.length; 

		duplicate.printRepeating(arr, arr_size); 
	} 
} 

//This code has been contributed by Mayank Jaiswal 

