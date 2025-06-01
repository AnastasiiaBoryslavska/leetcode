/**
 * You are given two integer arrays nums1 and nums2. We write the integers of nums1 and nums2 (in the order they are given) on two separate horizontal lines.

We may draw connecting lines: a straight line connecting two numbers nums1[i] and nums2[j] such that:

nums1[i] == nums2[j], and
the line we draw does not intersect any other connecting (non-horizontal) line.
Note that a connecting line cannot intersect even at the endpoints (i.e., each number can only belong to one connecting line).

Return the maximum number of connecting lines we can draw in this way.

Example 1:
Input: nums1 = [1,4,2], nums2 = [1,2,4]
Output: 2
Explanation: We can draw 2 uncrossed lines as in the diagram.
We cannot draw 3 uncrossed lines, because the line from nums1[1] = 4 to nums2[2] = 4 will intersect the line from nums1[2]=2 to nums2[1]=2.
 */

 class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        
        // Image that we add padding one dummy -1 to represent empty list
        // keep this in mind
        // nums1 = [-1] + nums1
        // nums2 = [-1] + nums2
        
        final int h = nums1.length, w = nums2.length;
        
        int[][] dp = new int[h+1][w+1];
        
        for( int y = 0 ; y < h ; y++){
            for( int x = 0 ; x < w ; x++){
                
                if( nums1[y] == nums2[x] ){
                    // current number is matched, add one more uncrossed line
                    dp[y+1][x+1] = dp[y][x] + 1;
                    
                }else{
                    // cuurent number is not matched, backtracking to find maximal uncrossed line
                    dp[y+1][x+1] = Math.max( dp[y][x+1], dp[y+1][x]);
                }
            }
        }
        return dp[h][w];
    }
}
