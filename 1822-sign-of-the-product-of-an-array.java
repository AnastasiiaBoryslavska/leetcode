/**
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

Example 1:

Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
 */

 class Solution {
    public int arraySign(int[] nums) {
        int countMinus = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] == 0){
                return 0; // return 0 if we found a 0 in the array
            }
            if(nums[i] < 0){
                countMinus++; //increment the count when we found a negative number
            }
        }
        //check if countMinus is multiple of 2 then return 1 else return -1
        return countMinus % 2 == 0 ? 1 : -1;
    }
}
