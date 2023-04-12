/**
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3] 
 */

 class Solution {
    public int[] buildArray(int[] nums) {
    int n = nums.length;
    
    for(int i=0; i<n; i++){
        // this is done to keep both old and new value together. 
        // going by the example of [5,0,1,2,3,4]
        // after this nums[0] will be 5 + 6*(4%6) = 5 + 24 = 29;
        // now for next index calulation we might need the original value of num[0] which can be obtain by num[0]%6 = 29%6 = 5;
        // if we want to get just he new value of num[0], we can get it by num[0]/6 = 29/6 = 4
        nums[i] = nums[i] + n*(nums[nums[i]] % n);
    }
    
    for(int i=0; i<n; i++){
        nums[i] = nums[i]/n;
    }
    
    return nums;
}
}
