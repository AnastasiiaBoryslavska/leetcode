// Given a binary array nums and an integer k, return the maximum number of consecutive 1's
// in the array if you can flip at most k 0's.
// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


public class Solution {
    public int longestOnes(int[] nums, int k) { 
        //define pointers, maxLen, zeroCounter
        int l = 0, r = 0, maxLen = 0, zeroCounter = 0;
        int n = nums.length;

        while(r < n) { //while r is not at the end of array
            if(nums[r] == 0) {
                zeroCounter++; // count zeroes
            }
            while(k < zeroCounter) { // if zeroes more than k -> move l pointer
                if(nums[l] == 0) { //if number at l pointer is zero -> decrement counter
                    zeroCounter--;
                }
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1); //update maxLen
            r++; //move r pointer
        }
        return maxLen; //return maxLen
    }
}
