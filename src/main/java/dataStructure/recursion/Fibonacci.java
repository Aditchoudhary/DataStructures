package dataStructure.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int result = fibo(30);
		System.out.println(result);
	}

	private static int fibo(int n){
		if(n<=1)
			return n;
		return fibo(n-1)+ fibo(n-2); 
	}
}
