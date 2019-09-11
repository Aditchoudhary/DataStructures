package dataStructure.array.max;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterNumber {

  static Stack<Integer> stack = new Stack();

  private static void printNextElement(int[] arr, int length) {

    HashMap<Integer, Integer> hm = new HashMap<>();
    if (arr.length > 0) {
      stack.push(arr[0]);
    }

    for (int i = 1; i < length; i++) {

      int top = stack.peek();
      while (top < arr[i]) {
        hm.put(top, arr[i]);
        //System.out.println("For Element: " + top + " -> " + arr[i]);
        stack.pop();
        if (stack.isEmpty()) {
          break;
        }
        top = stack.peek();
      }

      stack.push(arr[i]);

    }

    for (int i = 0; i < length; i++) {
      Integer value = hm.get(arr[i]);
      if(value == null){
        System.out.println(-1 + " ");
      }
      else{
        System.out.println(value+" ");
      }



    }

  }


  public static void main(String[] args) {

    int[] arr = {4, 3, 2, 1};
    int length = arr.length;

    printNextElement(arr, length);
  }
}
