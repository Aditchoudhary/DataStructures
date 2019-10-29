package dataStructure.string;

public class ClosestToZero {

    public static void main(String[] args) {
        int[] values = { 8, 2, -2, -1, 5 };
        calculateClosest(values);
    }

    private static int calculateClosest(int[] values) {
        if (values.length > 0) {
            int closest = Integer.MAX_VALUE;
            int closestValueAtIndex = 0;
            for (int i = 0; i < values.length; i++) {
                int curr = Math.abs(values[i]);
                if (curr < closest) {
                    closest = curr;
                    closestValueAtIndex = i;
                } else if (curr == closest && values[closestValueAtIndex] < 0
                        && values[i] > 0) {
                    closest = curr;
                    closestValueAtIndex = i;
                }
            }

            return values[closestValueAtIndex];
        }
        return -1;
    }

}
