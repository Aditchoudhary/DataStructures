package dataStructure.array.max;

public class MaxDiffInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 3, 1};
        System.out.println(getMaxDiff(arr));
    }

    private static int getMaxDiff(int[] arr) {
        //only for larger element appears after the smaller number
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - min_element > max_diff) {
                max_diff = arr[i] - min_element;
            }

            if (min_element > arr[i]) {
                min_element = arr[i];
            }
        }


        return max_diff;
    }

}
