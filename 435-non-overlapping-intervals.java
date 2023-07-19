/**
Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
 */

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count=0;
        int prev_end=intervals[0][1];
        for(int i=1;i<n;i++)
        {
            if(intervals[i][0]<prev_end)
            {
                count++;
            }
            else{
                prev_end=intervals[i][1];
            }
        }
        return count;
    }
}
