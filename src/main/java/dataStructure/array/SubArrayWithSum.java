package dataStructure.array;

public class SubArrayWithSum {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
    int subArraySum = 15;
    int start = 0;
    int sum = arr[start];
    for (int i = 1; i < arr.length; i++) {
      sum = sum + arr[i];

      while (sum > subArraySum & start < i) {
        sum = sum - arr[start];
        start++;
      }

      if (sum == subArraySum) {
        int startIndex = start;
        int endIndex = i;
        System.out.println("Start Index :" + ++startIndex + " Last Index :" + ++endIndex);
      }

    }
  }
}
