#Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that 
#i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

#Example 1:

#Input: nums = [1,2,3,4,5]
#Output: true
#Explanation: Any triplet where i < j < k is valid.

class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        i = float('inf')
        j = float('inf')

        for num in nums:
            if num <= i:
                i = num #smallest
            elif num <= j:
                j = num #second smallest
            else:
                #found a number greater than i and j
                return True 
        
        return False