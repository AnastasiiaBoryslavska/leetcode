/*
 Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

*/
class Solution {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0) return;

        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++) {
            capture(board, i, 0);
            capture(board, i, n - 1);
        }
        
        for(int j = 1; j < n - 1; j++) {
            capture(board, 0, j);
            capture(board, m - 1, j);
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
               if( board[i][j] == 'O') board[i][j] = 'X';
                                if(board[i][j] == 'T') board[i][j] = 'O';
            }
        }

    }

    private void capture(char[][] board, int i, int j) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        if(board[i][j] == 'X' || board[i][j] == 'T') return;
        board[i][j] = 'T';
        capture(board, i - 1, j);
        capture(board, i + 1, j);
        capture(board, i, j - 1);
        capture(board, i, j + 1);
    }
}
