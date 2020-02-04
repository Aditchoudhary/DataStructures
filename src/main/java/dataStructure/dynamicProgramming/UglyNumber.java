package dataStructure.dynamicProgramming;

public class UglyNumber {

	public static void main(String[] args) {
		
		System.out.println(getNthUglyNumber(15));

	}

	private static int getNthUglyNumber(int n) {

		int[] arr = new int[n];
		arr[0] = 1;
		int i = 1;
		int i2 = 1, i3 = 1, i5 = 1;

		int multiple_of_2;
		int multiple_of_3;
		int multiple_of_5;
		
		while (i < n) {
			multiple_of_2 = 2 * i2;
			multiple_of_3 = 3 * i3;
			multiple_of_5 = 5 * i5;
			int min = Math.min( Math.min(multiple_of_2, multiple_of_3), multiple_of_5);
			if (min == multiple_of_2) {
				i2++;
			}

			if (min == multiple_of_3) {
				i3++;

			}

			if (min == multiple_of_5) {
				i5++;
			}
			
			arr[i] = min;
			i++;
		}
	
		return arr[n-1];
	}

}
