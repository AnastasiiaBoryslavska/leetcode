/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
 */

var containsNearbyDuplicate = function(nums, k) {
    let set = new Set();
    for(let i = 0; i < nums.length; i++) {
        if(set.has(nums[i])) return true;

        set.add(nums[i]);


        if(set.size > k) {
            set.delete(nums[i - k]);
        }
    }
    return false;
};
