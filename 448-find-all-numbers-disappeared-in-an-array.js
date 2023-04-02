/**
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
*/

/**
 * @param {number[]} nums
 * @return {number[]}
 */

var findDisappearedNumbers = function(nums) {
    
    // Loop through each number in nums
    nums.forEach(number => {
        
        // Now we choose an index in the nums array based on the value we're currently looking at.
        // We do have to use Math.abs on it first, in case we've already visited this index and made it negative.
        // Then, since arrays are 0 indexed, subtract 1 from it
        const indexBasedOnThisValue = Math.abs(number) - 1
        
        // Then, look at the input array. Multiply it by -1 to mark it negative
        // We don't want to do this if we've already done so, which is why we check that it's greater than 0.
        if (nums[indexBasedOnThisValue] > 0) {
            nums[indexBasedOnThisValue] = nums[indexBasedOnThisValue] * -1
        }
    })
    
    // Now that we've marked the array with negative numbers, loop through it again.
    // This time, we'll be building our result
    const result = []
    
    for (let i=0; i<nums.length; i++) {
        // Check if the number at this position is positive or negative.
        // It doesn't matter what the number is necessarily, we just want to use the index of this value to check what we visited.
        // And again, since arrays are 0-indexed, we'll be off by one, so add 1 when we push to results.
        if (nums[i] > 0) {
            result.push(i + 1)
        }
    }
    
    return result
};
