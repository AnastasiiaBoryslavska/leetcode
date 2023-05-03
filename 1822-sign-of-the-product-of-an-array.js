/**
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

Example 1:

Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
var arraySign = function(nums) {
    let countNegative = 0;

    for(let i = 0; i < nums.length; i++) {
        if(nums[i] == 0) return 0;

        if(nums[i] < 0) countNegative++;
    }
    
    return countNegative % 2 == 0 ? 1 : -1;
};
