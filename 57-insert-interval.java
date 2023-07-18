/**
You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
 */

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int ns= newInterval[0];
        int ne= newInterval[1];
        int add=0;
        if(intervals.length==0){
            ans.add(newInterval);
            return ans.toArray(new int[0][0]);
        }
        if(ne<intervals[0][0]) {
            ans.add(newInterval);
            add++;
        }
        for(int i=0;i<intervals.length;i++){
            if(add==0&&intervals[i][1]<ns)// no overlap
              ans.add(intervals[i]);
            else if(add==0&&ne>=intervals[i][0])// overlap
            {
                ns=Math.min(ns,intervals[i][0]);
                ne=Math.max(ne, intervals[i][1]);
            }
            else if(add==0&&ne<intervals[i][0]){
                ans.add( new int[]{ns,ne});
                add++;
            }
            if(add>0) ans.add(intervals[i]);          
        }
        if(add==0) ans.add( new int[]{ns,ne});

        return ans.toArray(new int[0][0]);
    }
}
