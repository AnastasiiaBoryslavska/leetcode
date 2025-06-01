/**
 * Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.


Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
 */

var firstMissingPositive = function(nums) {
    let i = 0;
    while(i < nums.length) {
        if(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] !== nums[i]) {
            [nums[nums[i] - 1], nums[i]] = [nums[i], nums[nums[i] - 1]];
        } else {
            i++;
        }
    }

    for(let i = 0; i < nums.length; i++) {
        if(nums[i] !== i + 1) return i + 1;
    }
    return i + 1;
};
