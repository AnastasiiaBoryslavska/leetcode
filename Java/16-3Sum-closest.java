/**
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

 public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length; 
        int res = 0; 
        if (n <= 3) {
            for (int num:nums) 
                res += num; 
            return res; 
        }
        
        res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i <= n - 3; i++) {
            int j = i + 1; 
            int k = n - 1; 
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - res) >= Math.abs(target - sum)) {
                    res = sum; 
                    if (res == target) return res; 
                }
                if (sum > target) k--; 
                else if (sum < target) j++; 
            }
        }
        return res; 
    }
}
