#Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
#A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
#Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
#Output: 1
#Explanation: There is 1 equal row and column pair:
#- (Row 2, Column 1): [2,7,7]

class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        result = 0
        rows = {}
        for r in grid:
            key = ','.join(map(str, r))
            rows[key] = rows.get(key, 0) + 1

        # columns = {}
        n = len(grid)
        for j in range(n):
            key = ','.join([str(grid[i][j]) for i in range(n)])
            result += rows.get(key, 0)

        return result
        