package dataStructure.educative.slidingWindow;

import java.util.HashSet;

public class FindLengthForLongestSubStringWithNoRepeatChar {

	public static void main(String[] args) {
		System.out.println("Length of the longest substring: " + lengthOflongestSubString("aabccbb"));
	    System.out.println("Length of the longest substring: " + lengthOflongestSubString("abbbb"));
	    System.out.println("Length of the longest substring: " + lengthOflongestSubString("abccde"));
	    System.out.println("Length of the longest substring: " + lengthOflongestSubString("acbaacb"));

	}

	public static int lengthOflongestSubString(String s) {
		int length = Integer.MIN_VALUE, windowStart = 0;
		HashSet<Character> set = new HashSet<Character>();
		for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {

			if (set.contains(s.charAt(windowEnd))) {
				length = Math.max(windowEnd - windowStart, length);
				windowStart = windowEnd;
			}
			
			set.add(s.charAt(windowEnd));
			length =  Math.max(windowEnd - windowStart, length);
		}
		return length;
	}
}
