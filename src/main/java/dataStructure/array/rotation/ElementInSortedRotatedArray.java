package dataStructure.array.rotation;

public class ElementInSortedRotatedArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    ArrayRotation.leftRotate(arr, 2);

    int searchElement = 2;

    int index = search(arr, 0, arr.length - 1, searchElement);
    if (index >= 0 && index < arr.length)
      System.out.print("Index-> " + index + ", value-> " + arr[index]);
    else
      System.out.print("Not found");
  }

  private static int search(int[] arr, int start, int end, int searchElement) {

    if (start <= end) {

      int middle = (start + end) / 2;

      if (arr[middle] == searchElement) {
        return middle;
      }

      if (arr[start] <= arr[middle]) {
        if (arr[start] <= searchElement && arr[middle] > searchElement) {
          return search(arr, start, middle - 1, searchElement);
        } else {
          return search(arr, middle + 1, end, searchElement);
        }
      }

      if (arr[middle] < searchElement && arr[end] >= searchElement) {
        return search(arr, middle + 1, end, searchElement);
      } else {
        return search(arr, start, middle - 1, searchElement);
      }
    } else {
      return -1;
    }

  }
}