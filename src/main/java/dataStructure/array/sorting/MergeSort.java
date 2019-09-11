package dataStructure.array.sorting;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = {12, 23, 20, 3, 4, 7,2};
    MergeSort mergeSort = new MergeSort();
    mergeSort.mergeSort(arr, 0, arr.length - 1);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  private void mergeSort(int[] arr, int s, int e) {

    if (s < e) {
      int m = s + (e - s) / 2;

      mergeSort(arr, s, m);
      mergeSort(arr, m + 1, e);

      mergeArray(arr, s, m, e);
    }

  }

  private void mergeArray(int[] arr, int s, int m, int e) {

    int lenghtOfLeftArray = m - s + 1;
    int lengthOfRightArray = e - m;

    int[] leftArray = new int[lenghtOfLeftArray];
    int[] rightArray = new int[lengthOfRightArray];
    int k = s;
    for (int i = 0; i < lenghtOfLeftArray; i++) {
      leftArray[i] = arr[s];
      s++;
    }

    for (int i = 0; i < lengthOfRightArray; i++) {
      rightArray[i] = arr[m + 1];
      m++;
    }

    int i = 0;
    int j = 0;

    while (i < lenghtOfLeftArray && j < lengthOfRightArray) {
      if (leftArray[i] >= rightArray[j]) {
        arr[k] = rightArray[j];
        k++;
        j++;
      } else {
        arr[k] = leftArray[i];
        i++;
        k++;
      }
    }

    while (i < lenghtOfLeftArray) {
      arr[k] = leftArray[i];
      k++;
      i++;
    }

    while (j < lengthOfRightArray) {
      arr[k] = rightArray[j];
      k++;
      j++;
    }

  }

}
