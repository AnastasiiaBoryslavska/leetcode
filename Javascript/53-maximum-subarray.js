/**
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */

var maxSubArray = function(nums) {
    let maxSum = nums[0];
    let curSum = 0;

    for(let i = 0; i < nums.length; i++) {
        if(curSum < 0) {
            curSum = 0;
        }
        curSum += nums[i];
        maxSum = Math.max(maxSum, curSum);
    }
    return maxSum;
}
