package dataStructure.educative.slidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest
 *  substring in it with no more than K distinct characters.
 * @author Adit Choudhary
 *
 */
public class FindLongestStringWithKDistinctChar {

	public static void main(String[] args) {
		String value ="araaci";
		 System.out.println(findLongestString( value, 2));
		 System.out.println(findLongestString( value, 1));
		value = "cbbebi";
		System.out.println(findLongestString( value, 3));
	}

	private static String findLongestString(String value, int k){
		Map<Character,Integer> map = new HashMap<>();
		int windowStart=0; String result="";
		for (int windowEnd = 0; windowEnd < value.length(); windowEnd++) {
			 
			map.put(value.charAt(windowEnd), 
					map.getOrDefault(value.charAt(windowEnd), 0)+1);
			
			if(map.size()==k && (
					Math.max(windowEnd - windowStart + 1, result.length()) >result.length()
					)) {
				result = value.substring(windowStart,windowEnd+1); 
			}
			
			while(map.size() > k ){
				int count = map.get(value.charAt(windowEnd));
				if(count == 0){
					map.remove(value.charAt(windowEnd));
				}else{
					map.put(value.charAt(windowEnd), --count);
				}
				windowStart++;
			}
			
			
		}
		
		return result;
	}
	
}
