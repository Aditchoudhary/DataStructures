package dataStructure.array;

import java.util.Arrays;
/**
 * 
Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,3,2]
Output: 3
Example 2:

Input: [0,1,0,1,0,1,99]
Output: 99
 * 
 * @author Adit Choudhary
 *
 */
public class FindSingleElement {

	public static void main(String[] args) {
		int[] nums = {1,0,1,0,99};
		System.out.println(singleNumber(nums));
	}


	    public static int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        int result = nums[0];
	        
	        for(int i=1; i< nums.length; i++){
	            if(i+1< nums.length && nums[i-1]!= nums[i] && nums[i]!=nums[i+1] ){
	                result = nums[i];
	                break;
	            }
	            
	            if(i+1==nums.length && nums[i]!= nums[i-1]){
	                result = nums[i];
	                break;
	            }
	        }
	        
	        return result;
	    }
	
}
