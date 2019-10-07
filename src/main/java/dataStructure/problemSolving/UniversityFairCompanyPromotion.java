package dataStructure.problemSolving;

public class UniversityFairCompanyPromotion {

    public static void main(String[] args) {
        int[] arrivial = {1, 3, 3, 5, 7};
        int[] departure = {2, 2, 1, 2, 1};


        int a = arrivial[0];
        int finishedAt = arrivial[0] + departure[0];
        int count = 1;
        for (int i = 1; i < arrivial.length; i++) {

            if (arrivial[i] < finishedAt) {
                int d = arrivial[i] + departure[i];
                if (d > finishedAt) {
                    count++;
                    finishedAt = d;
                }
                continue;
            }

            if (arrivial[i] >= finishedAt) {
                finishedAt = arrivial[i] + departure[i];
                count++;
                continue;
            }

        }

        System.out.println("Total no of Promotions: " + count);

    }

}
