/*
 Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;

        int l = 0;
        int r = nums.length - 1;

        while(l < r) {
            int m = l + (r - l) / 2;
            
            if(nums[m] == target) return m;
            else if(nums[m] > target) r = m;
            else l = m + 1;
        }
        return nums[l] < target ? l + 1 : l;
    }
}


