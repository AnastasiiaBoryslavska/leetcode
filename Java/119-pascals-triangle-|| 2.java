/**
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
 */

 class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long temp = 1;
        for(int i=1,up=r,down=1;i<=r;i++,up--, down++){
            temp=temp*up/down;
            ans.add((int)temp);
        }
        return ans;
    }
}
