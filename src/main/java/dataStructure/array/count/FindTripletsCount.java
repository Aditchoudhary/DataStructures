package dataStructure.array.count;

import java.util.HashSet;
import java.util.Set;

public class FindTripletsCount {
  public static void main(String[] args) {
    int[] arr = {1,5,2,3,4};
    int count = 0;

    Set<Integer> hs = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      hs.add(arr[i]);
    }

    for (int i = 0; i < arr.length - 1; i++) {

      for (int j = i+1; j < arr.length; j++) {


        int requiredValue = arr[i] + arr[j];
        if (hs.contains(requiredValue)) {
          System.out.println("Req: "+ requiredValue);
          System.out.println("arr[i]: "+ arr[i]);
          System.out.println("arr[j]: "+ arr[j]);
          System.out.println();

          count++;
        }
      }
    }

    if(count>0){
      System.out.print(count);
    }else{
      System.out.println(-1);
    }
  }
}
