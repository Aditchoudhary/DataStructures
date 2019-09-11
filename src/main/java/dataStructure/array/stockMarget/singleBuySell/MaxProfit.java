package dataStructure.array.stockMarget.singleBuySell;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

/*
2
7
100 180 260 310 40 535 695
10
23 13 25 29 33 19 34 45 65 67
 */

class MaxProfit {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int test = Integer.parseInt(br.readLine());

    while (test > 0) {

      int length = Integer.parseInt(br.readLine());
      int[] arr = new int[length];

      String value = br.readLine();
      String[] values = value.split(" ");

      for (int i = 0; i < values.length; i++) {
        arr[i] = Integer.parseInt(values[i]);
      }

      int min = Integer.MAX_VALUE;
      int imin = 0;
      int imax = 0;
      int max = 0;
      int count = 0;
      for (int i = 0; i < arr.length; i++) {

        if (max > arr[i] && max > min && imax > imin) {
          System.out.print("(" + imin + imax + ")");
          System.out.print(" ");
          //min=0;imax=0;imin=0;imax = 0;
           min = Integer.MAX_VALUE;
           max = 0;
           count++;

        }

        if (min > arr[i]) {
          min = arr[i];
          imin = i;
        }

        if (max < arr[i] && i > imin) {
          max = arr[i];
          imax = i;
        }

      }

      if (imax > imin) {
        System.out.print("(" + imin + imax + ")");
        count++;
      }
      if(count==0){
        System.out.print("No Profit");
      }
      System.out.println();
      test--;
    }
  }
}
