/**
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:

Input: nums = [1,2,2,3]
Output: true
 */

/**
 * @param {number[]} nums
 * @return {boolean}
 */
var isMonotonic = function(A) {
    let arrLength = A.length;
    
    let isIncreasing = false;
    let isDecreasing = false;
    
    for(let i = 1; i <arrLength; i++){
        if(isIncreasing && isDecreasing){
            return false;
        }
        
        if(A[i] > A[i-1]){
            isIncreasing = true;
        } else if(A[i] < A[i-1]){
            isDecreasing = true;
        }
    }
    
    return !(isIncreasing && isDecreasing);
};
