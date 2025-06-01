/**
 * Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.


Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
 */

 class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        for(int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if(num > n) {
                continue;
            }
            num--;
            if(nums[num] > 0) {
                nums[num] = -1 * nums[num];
            }
        }

        for(int i = 0; i < n; i++) {
            if(nums[i] >= 0) {
                return i + 1;
            } 
        }
        return n + 1;
    }
}
