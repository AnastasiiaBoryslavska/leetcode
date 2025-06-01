/**
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
 */

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i:nums) {
            if(i>max)max=i;
            if(i<min)min=i;
        }

        int[] arr = new int[max-min+1];

        for(int i:nums) arr[i-min]++;

        for(int i=max-min; i>=0; i--) {
            k-=arr[i];
            if(k<=0) return i+min;
        }
        return -1;
    }
}
