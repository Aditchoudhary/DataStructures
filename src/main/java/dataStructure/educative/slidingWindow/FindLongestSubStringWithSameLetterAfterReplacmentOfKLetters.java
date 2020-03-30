package dataStructure.educative.slidingWindow;

import java.util.HashMap;

/**
 * Given a string with lowercase letters only, if you are allowed to replace 
 * no more than ‘k’ letters with any letter, 
 * find the length of the longest substring having the same letters after replacement.
 * @author Adit Choudhary
 *
 */
public class FindLongestSubStringWithSameLetterAfterReplacmentOfKLetters {

	public static void main(String[] args) {

		System.out.println(findLength("aabccbb", 2));
		System.out.println(findLength("abbcb", 1));
		System.out.println(findLength("abccde", 1));

	}

	public static int findLength(String s, int k) {

		int resultlenth = Integer.MIN_VALUE;
		int windowStart = 0;
		int maxRepeatInCurrentWindow = Integer.MIN_VALUE;
		HashMap<Character, Integer> charAndCount = new HashMap<>();

		for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {

			charAndCount.put(s.charAt(windowEnd), charAndCount.getOrDefault(s.charAt(windowEnd), 0) + 1);
			maxRepeatInCurrentWindow = Math.max(maxRepeatInCurrentWindow, charAndCount.get(s.charAt(windowEnd)));

			while (windowEnd - windowStart + 1 - maxRepeatInCurrentWindow > k) {

				charAndCount.put(s.charAt(windowStart), charAndCount.get(s.charAt(windowStart) - 1));
				windowStart++;

			}

			resultlenth = Math.max(windowEnd - windowStart + 1, resultlenth);

		}

		return resultlenth;
	}
}
