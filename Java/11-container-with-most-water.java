class Solution {
    public int maxArea(int[] height) {
        //define pointers, maxArea, height length
        int n = height.length, l = 0, r = n - 1, maxArea = Integer.MIN_VALUE;
        //find maxArea
        while(l < r) {
            int currArea = (r - l) * Math.min(height[l], height[r]);
            maxArea = Math.max(currArea, maxArea);
            if(height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        } 
        return maxArea;
    }
}

