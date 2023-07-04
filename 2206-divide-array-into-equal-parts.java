/**
You are given an integer array nums consisting of 2 * n integers.

You need to divide nums into n pairs such that:

Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.

Example 1:

Input: nums = [3,2,3,2,2,2]
Output: true
Explanation: 
There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
 */

 class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
       // int count = 0;
        for( int i = 0; i< nums.length ; i+=2){
            if(nums[i] != nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
