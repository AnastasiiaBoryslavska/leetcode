/*
 You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.

Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.
*/

class Solution{
    int max = 0;
    int currMax = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int m = 0; m < grid.length; m++) {
            for(int n = 0; n < grid[0].length; n++) {
                if(grid[m][n] == 1) {
                    currMax = 0;
                    dfs(m, n, grid);
                }
            }
        }
        return max;
    }

    private void dfs(int m, int n, int[][] grid) {
        if(m < 0 || m >= grid.length || n < 0 || n >= grid[0].length || grid[m][n] != 1) return;

        grid[m][n] = -1; //mark visited part of the island
        currMax++;

        dfs(m + 1, n, grid);
        dfs(m - 1, n, grid);
        dfs(m, n + 1, grid);
        dfs(m, n - 1, grid);

        max = Math.max(max, currMax);

    }
}
