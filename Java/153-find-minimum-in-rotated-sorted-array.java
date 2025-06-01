/*  Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

 */

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;
            //if nums[mid] is less than the rightmost element, it means element at mid can be the minimum or minimum element exist in left side of mid.
            if(nums[mid] < nums[right]) {
                right = mid;
            //if first condition is false it means nums[mid] is greater than the rightmost element, miminum element must be present in the right side of the mid.
            } else {
                left = mid + 1;
            }
        }
        //at the end both left and right will be having the same index value & while loop will break, at the end both l & h pointing to the min value i.e we can return nums[l] or nums[h] here.
        return nums[left];
    }
}