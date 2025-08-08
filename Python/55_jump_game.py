'''
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
'''

class Solution:
    def canJump(self, nums: List[int]) -> bool:
        gas = 0

        for num in nums:
            if gas < 0:
                return False
            elif num > gas:
                gas = num
            gas -= 1
        
        return True
    