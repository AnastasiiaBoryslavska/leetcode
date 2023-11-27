/**
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */

//Boyer-Moore Voting Algorithm

var majorityElement = function(nums) {
    let candidate, count = 0;

    for(let num of nums) {
        if(count === 0) {
            candidate = num;
        }

        if(candidate === num) {
            count++;
        } else {
            count--;
        }
    }
    return candidate;
};

//map

/**
var majorityElement = function(nums) {
    let n = nums.length;
    let map = new Map();

    for(let i = 0; i < n; i++) {
        if(!map.has(nums[i])) {
            map.set(nums[i], 1)
        } else {
            map.set(nums[i], map.get(nums[i]) + 1)
        }
    }
        
    n = n / 2;

    for(let [key, value] of map.entries()) {
        if(value > n) {
            return key;
        }
    }
    return 0;
};
 */