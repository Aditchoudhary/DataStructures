package dataStructure.array.miscellanous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class MemoriseMe {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int total = Integer.parseInt(br.readLine());
    String values = br.readLine();
    String[] str = values.split(" ");

    HashMap<String, Integer> hm = new HashMap();
    Arrays.stream(str).forEach(s -> {
      if (hm.containsKey(s)) {
        hm.put(s, hm.get(s) + 1);
      } else {
        hm.put(s, 1);
      }
    });
    int totalRound = Integer.parseInt(br.readLine());
    while (totalRound > 0) {
      String check = br.readLine();
      System.out.println(hm.containsKey(check) ? hm.get(check) : "NOT PRESENT");
      totalRound--;
    }
  }
}
