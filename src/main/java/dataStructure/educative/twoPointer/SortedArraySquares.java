package dataStructure.educative.twoPointer;

/**
 * Given a sorted array, 
 * create a new array containing squares of all the number of the 
 * input array in the sorted order.
 * @author Adit Choudhary
 *
 */
public class SortedArraySquares {
	
	public static void main(String[] args) {
		int[] result = SortedArraySquares.makeSquares(new int[] { -2, -1, 0, 2, 3 });
	    for (int num : result)
	      System.out.print(num + " ");
	    System.out.println();

	    result = SortedArraySquares.makeSquares(new int[] { -3, -1, 0, 1, 2 });
	    for (int num : result)
	      System.out.print(num + " ");
	    System.out.println();
	}
	
	public static int[] makeSquares(int[] arr) {
		int [] newArr = new int[arr.length];
		int index =arr.length -1 ;
		int i = 0;
		int j = arr.length -1;
		
		while(j>=i){
			if(arr[i]*arr[i] < arr[j]*arr[j]){
				newArr[index] = arr[j]*arr[j];
				j--;
				index--;
			}else {
				newArr[index] = arr[i]*arr[i];
				i++;
				index--;
			}
		}
		
		
		return newArr;
	}

}
