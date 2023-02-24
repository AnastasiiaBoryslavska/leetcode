/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4. 
*/

class Solution {
    public int rob(int[] nums) {
        int robbedPrevHouse = 0; //max money can get if robbed current house
        int didntRobbedPrevHouse = 0; //max money can get if did not rob current house

        for(int i = 0; i < nums.length; i++) {
            // If we rob current cell, previous cell shouldn't be robbed. So, add the current value to previous one.
            int currRobbed = didntRobbedPrevHouse + nums[i];

            // If we don't rob current cell, then the count should be max of the previous cell robbed and not robbed
            int currNotRobbed = Math.max(didntRobbedPrevHouse, robbedPrevHouse);

            // Update values for the next round
            robbedPrevHouse = currRobbed;
            didntRobbedPrevHouse = currNotRobbed;
        }
        return Math.max(robbedPrevHouse, didntRobbedPrevHouse);
    }
}