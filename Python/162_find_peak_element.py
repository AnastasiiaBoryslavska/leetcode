'''
A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
'''

class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1
        while left < right - 1:
            mid = (left + right)//2
            if nums[mid] > nums[mid + 1] and nums[mid] > nums[mid - 1]:
                return mid

            if nums[mid] < nums[mid+1]:
                left = mid + 1
            else:
                right = mid-1
            
        return left if nums[left] >= nums[right] else right
    