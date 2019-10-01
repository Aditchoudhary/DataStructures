package dataStructure.string;

public class LongestSubstring {

    public static void main(String[] args) {
        int[] ar = new int[26];
        //String s = "geeksforgeeks";
        String s = "additchoudchoud";
        //a-97,z-122
        Values values = new Values();
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 97;
            if (ar[value] == 0)
                ar[value] = i;
            else {
                if(values.length < i-j ){
                values.length =  i -j;
                values.startIndex = j;
                values.endIndex = i-1;
                }
              int index = ar[value];
              j = index+1;
              ar[value] = i;

            }
        }

        System.out.println(values.length);
        for (int i = values.startIndex; i <= values.endIndex ; i++) {
            System.out.print(s.charAt(i));
        }

    }

    static class Values{
        int length;
        int  startIndex;
        int endIndex;
    }

}


