package dataStructure.array.sorting;

public class QuickSort {

  public static void main(String[] args) {

    int[] arr = {20, 12, 45, 23, 2, 3, 6};
    quicksort(arr, 0, arr.length-1);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  private static void quicksort(int[] arr, int low, int high) {

    if (low < high) {
      int pivotIndex = partition(arr, low, high);

      quicksort(arr,low, pivotIndex-1);
      quicksort(arr, pivotIndex+1, high);
    }

  }

  private static int partition(int[] arr, int low, int high) {

    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j <= high; j++) {

      if (arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[i + 1];
    arr[i + 1] = pivot;
    arr[high] = temp;
    return i + 1;
  }

}
