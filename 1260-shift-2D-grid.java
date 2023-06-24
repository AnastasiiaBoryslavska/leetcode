/**
Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.

In one shift operation:

Element at grid[i][j] moves to grid[i][j + 1].
Element at grid[i][n - 1] moves to grid[i + 1][0].
Element at grid[m - 1][n - 1] moves to grid[0][0].
Return the 2D grid after applying shift operation k times.

Example 1:
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[9,1,2],[3,4,5],[6,7,8]]
*/

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        // if shifting total times, it shifts back to orignal state
        k = k % (total);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            result.add(list);
            for (int j = 0; j < n; j++) {   
                // i * n + j original place index in 1D array
                // i * n + j - k  is to get value k steps before                 
                int index = ((i * n + j) - k + total) % total;
                list.add(grid[index / n][index % n]);
            }
        }
        return result;
    }
}
