/* Given n non-negative integers representing an elevation map where the width of each bar is 1,
   compute how much water it can trap after raining.
*/

class Solution {
    public int trap(int[] height) {
        //base case
        if(height == null) return 0;

        //create left and right pointers
        int left = 0;
        int right = height.length - 1;
        //create maximum left and maximum right to store the max value of left or right pointers
        int maxLeft = height[left];
        int maxRight = height[right];
        //result for storing the answer
        int result = 0;

        while(left < right) {
            if(maxLeft < maxRight) { 
                left++;  //shift left pointer if maxLeft < maxRight
                maxLeft = Math.max(maxLeft, height[left]);  //update the max value for maxLeft;
                result += maxLeft - height[left]; // update the result using this formula to compute the max trapped water
             } else {  
                right--;  //shift right pointer if maxRight < maxLeft
                maxRight = Math.max(maxRight, height[right]);  //update the max value for the maxRight
                result += maxRight - height[right]; // update the result using this formula to compute the max trapped water
            } 
        }
        return result;
    }
}