#Given an array of integers nums, calculate the pivot index of this array.
#The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal
#to the sum of all the numbers strictly to the index's right.
#If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
#This also applies to the right edge of the array.
#Return the leftmost pivot index. If no such index exists, return -1.

#Example 1:

#Input: nums = [1,7,3,6,5,6]
#Output: 3
#Explanation:
#The pivot index is 3.
#Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
#Right sum = nums[4] + nums[5] = 5 + 6 = 11

class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        
        # Initialization:
        # Left hand side be empty, and
        # Right hand side holds all weights.
        total_weight_on_left, total_weight_on_right = 0, sum(nums)

        for idx, current_weight in enumerate(nums):

            total_weight_on_right -= current_weight

            if total_weight_on_left == total_weight_on_right:
                # balance is met on both sides
                # i.e., sum( nums[ :idx] ) == sum( nums[idx+1: ] )
                return idx

            total_weight_on_left += current_weight

        return -1