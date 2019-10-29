package dataStructure.problemSolving;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class RottenOrange {

    static class Coordinates {
        int i;
        int j;

        public Coordinates(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }


    static int r;
    static int c;

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());
        while (t > 0) {


            String rc = in.readLine();
            String[] ro = rc.split(" ");
            r = Integer.parseInt(ro[0]);
            c = Integer.parseInt(ro[1]);
            String data = in.readLine();

            int v = 0;
            String[] d = data.split(" ");
            int[][] ar = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    ar[i][j] = Integer.parseInt(d[v++]);
                }
            }

            Queue<Coordinates> queue = new LinkedList<>();

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (ar[i][j] == 2) {
                        queue.add(new Coordinates(i, j));
                    }
                }
            }
            queue.add(null);
            int ans = 0;
            while (!queue.isEmpty()) {
                boolean flag = false;
                while (queue.peek() != null) {
                    Coordinates coordinates = queue.peek();
                    int i = coordinates.i;
                    int j = coordinates.j;

                    if (i - 1 >= 0 && ar[i - 1][j] == 1) {
                        if (!flag) {
                            flag = true;
                            ans++;
                        }
                        ar[i - 1][j] = 2;
                        queue.add(new Coordinates(i - 1, j));
                    }

                    if (i + 1 < r && ar[i + 1][j] == 1) {
                        if (!flag) {
                            flag = true;
                            ans++;
                        }
                        ar[i + 1][j] = 2;
                        queue.add(new Coordinates(i + 1, j));
                    }

                    if (j + 1 < c && ar[i][j + 1] == 1) {
                        if (!flag) {
                            flag = true;
                            ans++;
                        }
                        ar[i][j + 1] = 2;
                        queue.add(new Coordinates(i, j + 1));
                    }

                    if (j - 1 >= 0 && ar[i][j - 1] == 1) {
                        if (!flag) {
                            flag = true;
                            ans++;
                        }
                        ar[i][j - 1] = 2;
                        queue.add(new Coordinates(i, j - 1));
                    }
                    queue.poll();
                }
                queue.poll();

                if (!queue.isEmpty())
                    queue.add(null);
            }


            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (ar[i][j] == 1) {
                        ans = -1;
                        break;
                    }
                }
            }

            System.out.println(ans);

            t--;
        }


    }

}