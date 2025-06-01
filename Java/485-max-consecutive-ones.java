class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //define maxLen and counter
        int maxLen = 0, counter = 0;
        //iterate over array 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                counter++;
                maxLen = Math.max(maxLen, counter); //update maxLen
            } else {
                counter = 0;
            }
        }
        //return maxLen
        return maxLen;
    }
}

