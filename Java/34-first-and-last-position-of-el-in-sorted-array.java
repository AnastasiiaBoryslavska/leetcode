/**
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */

 class Solution {
    public int[] searchRange(int[] nums, int target) {
         double left = target - 0.5, right = target + 0.5;
         int l = bs(nums, left), r = bs(nums, right);
         if(l == r) return new int[]{-1, -1};
         return new int[]{l, r-1};
 }
     
 public int bs(int[] nums, double target) {
         int l = 0, h = nums.length-1;
         while(l <= h){
             int m = l + (h - l)/2;
             if(target > nums[m]) l = m+1;
             else h = m-1;
         }
         return l;
 }
 }
 