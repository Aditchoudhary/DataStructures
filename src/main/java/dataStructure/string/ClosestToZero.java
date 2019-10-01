package dataStructure.string;

public class ClosestToZero {

    public static void main(String[] args) {
        int[] values = {8, 2, -2, -1, 5};
        int diff = Integer.MAX_VALUE;
        int closestIndex = 0;
        for (int i = 0; i < values.length; i++) {
            int curr = Math.abs(values[i]);
            if (curr < diff) {
                diff = curr;
                closestIndex = i;
            } else if (curr == diff && values[closestIndex] < 0 && values[i] > 0) {
                diff = curr;
                closestIndex = i;
            }
        }

        System.out.println(values[closestIndex]);
    }

}
