package dataStructure.dynamicProgramming;

public class FibonacciMemorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibo(2));
		
		
	}
	
	private static int fibo(int n){
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
			
		return arr[n-1];
	}

}
