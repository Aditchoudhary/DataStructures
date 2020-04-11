package dataStructure.educative.slidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string and a pattern, find the smallest substring in the given string which has all the 
 * characters of the given pattern.
 * @author aditm
 *
 */
class MinimumWindowSubstring {
	public static String findPermutation(String str, String pattern) {
		String minString = "";
		int minLength = Integer.MAX_VALUE;
		int windowStart = 0;
		int windowEnd = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (windowEnd = 0; windowEnd < str.length(); windowEnd++) {

			char right = str.charAt(windowEnd);
			
			if(pattern.contains(Character.toString(right))){
				map.put(right, map.getOrDefault(right, 0)+1);
			}

			if(map.size()==pattern.length()){
				
				if(minLength> windowEnd-windowStart+1){
					minString = str.substring(windowStart, windowEnd+1);
					minLength = windowEnd-windowStart+1;
				}
				
			}
			
			while(map.size()==pattern.length()){
				
				char left =str.charAt(windowStart);
				if(pattern.contains(Character.toString(left))){
					
				int count = map.get(left);
				count--;
				
					if(count==0){
						map.remove(left);
					}else{
						map.put(left, count);
					}
					
				}
				windowStart++;
				
				if(map.size()==pattern.length()){
					
					if(minLength> windowEnd-windowStart+1){
						minString = str.substring(windowStart, windowEnd+1);
						minLength = windowEnd-windowStart+1;
					}
					
				}
				
			}
			
			
		}

		return minString;
	}

	public static void main(String[] args) {
		System.out.println(MinimumWindowSubstring.findPermutation("aabdec", "abc"));
		System.out.println(MinimumWindowSubstring.findPermutation("abdabca", "abc"));
		System.out.println(MinimumWindowSubstring.findPermutation("adcad", "abc"));
	}
}
