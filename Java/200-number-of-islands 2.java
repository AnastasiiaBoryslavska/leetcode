/* Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
   An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
   You may assume all four edges of the grid are all surrounded by water.
 
   Example 1:

   Input: grid = [
    ["1","1","1","1","0"],
    ["1","1","0","1","0"],
    ["1","1","0","0","0"],
    ["0","0","0","0","0"]
    ]
    Output: 1
 */
 class Solution {
    char[][] g;
    public int numIslands(char[][] grid) {
        int islands = 0;
        g = grid;

        for(int i = 0; i < g.length; i++) {
            for(int j = 0; j < g[i].length; j++) {
                islands += sink(i, j);
            }
        }
        return islands;
    }

    int sink(int i, int j) {
        if(i < 0 || i == g.length || j < 0 || j == g[i].length || g[i][j] == '0') {
            return 0;
        }

        g[i][j] = '0'; //"sinking" the island by marking it as water
        sink(i + 1, j);  //checking all four directions, because the problem says "You may assume all four edges of the grid are all surrounded by water."
        sink(i - 1, j);
        sink(i, j + 1);
        sink(i, j - 1);

        return 1;
    }
 }