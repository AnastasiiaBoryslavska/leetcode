class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //define pointers, minLen, sum
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        //find minLen of subarray sum
        while(r < n) {
            sum += nums[r];
            while(target <= sum) { //meet condition
                minLen = Math.min(minLen, r - l + 1); //update minLen
                sum -= nums[l]; //contract window
                l++;
             }
        }
        //return 0 or minLen
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}