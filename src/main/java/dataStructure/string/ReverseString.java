package dataStructure.string;

public class ReverseString {
    static String str = "";

    public static void main(String[] args) {
        String s = "Adobe";
        String st = reverseString(s, 0);
        System.out.println(str);

    }

    public static String reverseString(String s, int i) {

        if (i >= s.length())
            return "";

        str = str + reverseString(s, i + 1);
        str = str + s.charAt(i);
        return str;
    }
}
