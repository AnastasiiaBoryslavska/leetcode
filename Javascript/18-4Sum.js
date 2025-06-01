/**
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 */

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
function fourSum(nums, target) {
    const result = [];
    const n = nums.length;
    if (n < 4) return result;
    nums.sort((a, b) => a - b);
    
    for (let i = 0; i < n - 3; i++) {
      if (i > 0 && nums[i] === nums[i - 1]) continue; // skip duplicates
      if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break; // early termination
      if (nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) continue; // early termination
      
      for (let j = i + 1; j < n - 2; j++) {
        if (j > i + 1 && nums[j] === nums[j - 1]) continue; // skip duplicates
        if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break; // early termination
        if (nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) continue; // early termination
        
        let left = j + 1;
        let right = n - 1;
        while (left < right) {
          const sum = nums[i] + nums[j] + nums[left] + nums[right];
          if (sum < target) {
            left++;
          } else if (sum > target) {
            right--;
          } else {
            result.push([nums[i], nums[j], nums[left], nums[right]]);
            while (left < right && nums[left] === nums[left + 1]) left++; // skip duplicates
            while (left < right && nums[right] === nums[right - 1]) right--; // skip duplicates
            left++;
            right--;
          }
        }
      }
    }
    
    return result;
  }
  